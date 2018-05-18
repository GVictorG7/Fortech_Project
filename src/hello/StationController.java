package hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import hello.service.StationService;

@Controller
public class StationController {
	@Autowired
	private StationService stationService;

	@RequestMapping(value = "/station", method = RequestMethod.GET)
	public ModelAndView station() {
		return new ModelAndView("station", "command", new Station());
	}

	@RequestMapping(value = "/stations", method = RequestMethod.GET)
	public ModelAndView showStations(@ModelAttribute("SpringWeb") Station station, ModelMap model) {
		List<Station> sts = stationService.getAll();
		model.addAttribute("stations", sts);
		return new ModelAndView("station", "command", new Station());
	}

	@RequestMapping(value = "/addStation", method = RequestMethod.GET)
	public ModelAndView addStation(@ModelAttribute("SpringWeb") Station station, ModelMap model) {
		model.addAttribute("ip", station.getIp());
		System.out.println(station.getIp());

		stationService.save(station);
		return new ModelAndView("station", "command", new Station());
	}

	@RequestMapping(value = "/detalii", method = RequestMethod.GET)
	public ModelAndView detalii(@ModelAttribute("SpringWeb") Station station, ModelMap model) {
		model.addAttribute("idStation", station.getIdStation());
		Station station2 = stationService.get(station.getIdStation());
		model.addAttribute("ports", station2.getPorts());
		model.addAttribute("ip", station2.getIp());

		model.addAttribute("ports", station2.getPorts());
		return new ModelAndView("port", "command", new Port());
	}

	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public ModelAndView logout(@ModelAttribute("SpringWeb") Station station, ModelMap model) {
		return new ModelAndView("user", "command", new User());
	}
}
