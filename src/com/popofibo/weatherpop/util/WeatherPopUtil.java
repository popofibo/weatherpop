package com.popofibo.weatherpop.util;

import android.annotation.SuppressLint;
import com.popofibo.weatherpop.constants.WeatherPopConstants;

/**
 * 
 * @author popofibo
 * 
 */
@SuppressLint("DefaultLocale")
public class WeatherPopUtil {

	public static String modifyDescription(String descr, String option) {
		String modDesc = descr;

		if (option != null) {
			if (descr != null) {
				if (option.equalsIgnoreCase("Default")) {
					if (WeatherPopConstants.ATM_FOG.equalsIgnoreCase(descr)) {
						modDesc = "Holy shit, Fucking Fog! Won't see shit";
					}
					if (WeatherPopConstants.ATM_HAZE.equalsIgnoreCase(descr)) {
						modDesc = "Fucking hazy man! Can't see shit";
					}
					if (WeatherPopConstants.ATM_MIST.equalsIgnoreCase(descr)) {
						modDesc = "Tiny fucking water droplets";
					}
					if (WeatherPopConstants.ATM_SAND_DUST
							.equalsIgnoreCase(descr)) {
						modDesc = "Fucking whirls of dust";
					}
					if (WeatherPopConstants.ATM_SMOKE.equalsIgnoreCase(descr)) {
						modDesc = "Damn smoke will fuck your vision up";
					}
					if (WeatherPopConstants.CLD_BROKEN.equalsIgnoreCase(descr)) {
						modDesc = "Damn those broken fucking clouds";
					}
					if (WeatherPopConstants.CLD_CLEAR.equalsIgnoreCase(descr)) {
						modDesc = "Sky is fucking clear, time to get a beer";
					}
					if (WeatherPopConstants.CLD_FEW.equalsIgnoreCase(descr)) {
						modDesc = "Few fucking clouds";
					}
					if (WeatherPopConstants.CLD_OVERCAST
							.equalsIgnoreCase(descr)) {
						modDesc = "Fucking overcast as hell";
					}
					if (WeatherPopConstants.CLD_SCAT.equalsIgnoreCase(descr)) {
						modDesc = "Clouds scattered fucking everywhere";
					}
					if (WeatherPopConstants.DRIZ.equalsIgnoreCase(descr)) {
						modDesc = "It decides to fucking drizzle";
					}
					if (WeatherPopConstants.DRIZ_HEAVY_INT
							.equalsIgnoreCase(descr)) {
						modDesc = "Heavy fucking drizzle";
					}
					if (WeatherPopConstants.DRIZ_HEAVY_INT_RAIN
							.equalsIgnoreCase(descr)) {
						modDesc = "Heavy fucking intensity rain and goddamn drizzle";
					}
					if (WeatherPopConstants.DRIZ_LIGHT_INT
							.equalsIgnoreCase(descr)) {
						modDesc = "Heavy fucking intensity rain and goddamn drizzle";
					}
					if (WeatherPopConstants.DRIZ_LIGHT_INT_RAIN
							.equalsIgnoreCase(descr)) {
						modDesc = "Light fucking drizzle";
					}
					if (WeatherPopConstants.DRIZ_RAIN.equalsIgnoreCase(descr)) {
						modDesc = "Light fucking drizzle";
					}
					if (WeatherPopConstants.DRIZ_SHOWER.equalsIgnoreCase(descr)) {
						modDesc = "Goddamn drizzle with shower";
					}
					if (WeatherPopConstants.EXT_COLD.equalsIgnoreCase(descr)) {
						modDesc = "Cold as fucking hell's goddman freezer";
					}
					if (WeatherPopConstants.EXT_HAIL.equalsIgnoreCase(descr)) {
						modDesc = "Save your ass, hail storm";
					}
					if (WeatherPopConstants.EXT_HOT.equalsIgnoreCase(descr)) {
						modDesc = "Hot as in a fucking hellfire. Why the fuck would anyone live there!";
					}
					if (WeatherPopConstants.EXT_HURR.equalsIgnoreCase(descr)) {
						modDesc = "Goddamn hurricane";
					}
					if (WeatherPopConstants.EXT_TORNADO.equalsIgnoreCase(descr)) {
						modDesc = "Fucking tonado, gotta save your ass";
					}
					if (WeatherPopConstants.EXT_TROP_STORM
							.equalsIgnoreCase(descr)) {
						modDesc = "A tropical fucking storm? Seriously where the fuck are you!";
					}
					if (WeatherPopConstants.EXT_WINDY.equalsIgnoreCase(descr)) {
						modDesc = "Fucking winds tearing it all apart";
					}
					if (WeatherPopConstants.RAIN_EXTREME
							.equalsIgnoreCase(descr)) {
						modDesc = "Goddman extreme fucking rain";
					}
					if (WeatherPopConstants.RAIN_HEAVY.equalsIgnoreCase(descr)) {
						modDesc = "Some heavy shit rain";
					}
					if (WeatherPopConstants.RAIN_HEAVY_INT
							.equalsIgnoreCase(descr)) {
						modDesc = "Heave fucking intensity rain";
					}
					if (WeatherPopConstants.RAIN_HEAVY_INT_SHOW
							.equalsIgnoreCase(descr)) {
						modDesc = "Ass tearing heavy fucking intensity rain with goddamn showers";
					}
					if (WeatherPopConstants.RAIN_LIGHT.equalsIgnoreCase(descr)) {
						modDesc = "Weakass rain";
					}
					if (WeatherPopConstants.RAIN_LIGHT_INT_SHOW
							.equalsIgnoreCase(descr)) {
						modDesc = "Weakass rain with shitty showers";
					}
					if (WeatherPopConstants.RAIN_MOD.equalsIgnoreCase(descr)) {
						modDesc = "Fucking rain in moderate amounts. DAMN!";
					}
					if (WeatherPopConstants.RAIN_SHOW.equalsIgnoreCase(descr)) {
						modDesc = "Shower goddman rain";
					}
					if (WeatherPopConstants.SNOW.equalsIgnoreCase(descr)) {
						modDesc = "Fucking Snow";
					}
					if (WeatherPopConstants.SNOW_HEAVY.equalsIgnoreCase(descr)) {
						modDesc = "Heavyass snow";
					}
					if (WeatherPopConstants.SNOW_LIGHT.equalsIgnoreCase(descr)) {
						modDesc = "Weakass snow";
					}
					if (WeatherPopConstants.SNOW_SHOW.equalsIgnoreCase(descr)) {
						modDesc = "It's a fucking shower snow";
					}
					if (WeatherPopConstants.SNOW_SLEET.equalsIgnoreCase(descr)) {
						modDesc = "Fucking goddamn sleet";
					}
					if (WeatherPopConstants.THUN.equalsIgnoreCase(descr)) {
						modDesc = "Fucking thunder";
					}
					if (WeatherPopConstants.THUN_DRIZ.equalsIgnoreCase(descr)) {
						modDesc = "Thunder with fucking drizzle";
					}
					if (WeatherPopConstants.THUN_HEAVY.equalsIgnoreCase(descr)) {
						modDesc = "Heavy fucking thunderstorm";
					}
					if (WeatherPopConstants.THUN_HEAVY_DRIZ
							.equalsIgnoreCase(descr)) {
						modDesc = "Thunderstorm with goddamn heavyass drizzle";
					}
					if (WeatherPopConstants.THUN_HEAVY_RAIN
							.equalsIgnoreCase(descr)) {
						modDesc = "Thuderstorm with heavyass rain";
					}
					if (WeatherPopConstants.THUN_LIGHT.equalsIgnoreCase(descr)) {
						modDesc = "Weakass thunderstorm";
					}
					if (WeatherPopConstants.THUN_LIGHT_DRIZ
							.equalsIgnoreCase(descr)) {
						modDesc = "Thunderstorm with weakass drizzle";
					}
					if (WeatherPopConstants.THUN_LIGHT_RAIN
							.equalsIgnoreCase(descr)) {
						modDesc = "Thunderstorm with weakass rain";
					}
					if (WeatherPopConstants.THUN_RAGGED.equalsIgnoreCase(descr)) {
						modDesc = "Ragged fucking thunderstorm";
					}
					if (WeatherPopConstants.THUN_RAIN.equalsIgnoreCase(descr)) {
						modDesc = "Thunderstorm with fucking rain";
					}
				}
				if (option.equalsIgnoreCase("Moronic")) {
					if (WeatherPopConstants.ATM_FOG.equalsIgnoreCase(descr)) {
						modDesc = "De webuhadeh today is foggy outside! Huh huh! Can't see anydigg";
					}
					if (WeatherPopConstants.ATM_HAZE.equalsIgnoreCase(descr)) {
						modDesc = "Fuckigg hazy! Doihh, COOL!";
					}
					if (WeatherPopConstants.ATM_MIST.equalsIgnoreCase(descr)) {
						modDesc = "Tiny wateh droblets, HUH!";
					}
					if (WeatherPopConstants.ATM_SAND_DUST
							.equalsIgnoreCase(descr)) {
						modDesc = "Round 'n round mobigg of the, uhhh, dust";
					}
					if (WeatherPopConstants.ATM_SMOKE.equalsIgnoreCase(descr)) {
						modDesc = "It is a smoke fillid atmosphehe";
					}
					if (WeatherPopConstants.CLD_BROKEN.equalsIgnoreCase(descr)) {
						modDesc = "Clouds are broke, what wudd webuh do now, duh...uh...?";
					}
					if (WeatherPopConstants.CLD_CLEAR.equalsIgnoreCase(descr)) {
						modDesc = "De sky is clear 'n de birds are chirpigg! Doihh, COOL!";
					}
					if (WeatherPopConstants.CLD_FEW.equalsIgnoreCase(descr)) {
						modDesc = "Mighty few clouds is thar! Fry mah hide!";
					}
					if (WeatherPopConstants.CLD_OVERCAST
							.equalsIgnoreCase(descr)) {
						modDesc = "De sky abobe has lot of clouds";
					}
					if (WeatherPopConstants.CLD_SCAT.equalsIgnoreCase(descr)) {
						modDesc = "Scattehid clouds ebehywhehe, uh, hehe 'n dehe! Huh huh!";
					}
					if (WeatherPopConstants.DRIZ.equalsIgnoreCase(descr)) {
						modDesc = "Drizzle outside, uh uh uh, what do I do now, duh...uh...?";
					}
					if (WeatherPopConstants.DRIZ_HEAVY_INT
							.equalsIgnoreCase(descr)) {
						modDesc = "Pretty heaby intensity drizzle now! Doihh, COOL";
					}
					if (WeatherPopConstants.DRIZ_HEAVY_INT_RAIN
							.equalsIgnoreCase(descr)) {
						modDesc = "Pretty heaby intensity rain wid drizzle as webuhll!";
					}
					if (WeatherPopConstants.DRIZ_LIGHT_INT
							.equalsIgnoreCase(descr)) {
						modDesc = "Lite intensity drizzle is goigg t' happen today!";
					}
					if (WeatherPopConstants.DRIZ_LIGHT_INT_RAIN
							.equalsIgnoreCase(descr)) {
						modDesc = "Dehe is alittle drizzle 'n rain, duh...uh...";
					}
					if (WeatherPopConstants.DRIZ_RAIN.equalsIgnoreCase(descr)) {
						modDesc = "Drizzle 'n Rain is beigg cuzd! Huh huh!";
					}
					if (WeatherPopConstants.DRIZ_SHOWER.equalsIgnoreCase(descr)) {
						modDesc = "Drizzle 'n Showebuhr is gettigg cuzd";
					}
					if (WeatherPopConstants.EXT_COLD.equalsIgnoreCase(descr)) {
						modDesc = "Dat's behy behy behy COLD mate! Huh huh!";
					}
					if (WeatherPopConstants.EXT_HAIL.equalsIgnoreCase(descr)) {
						modDesc = "HAILSOTRM f' the, uh, the win! Yay! Doihh, COOL!";
					}
					if (WeatherPopConstants.EXT_HOT.equalsIgnoreCase(descr)) {
						modDesc = "So behy behy HOT gobbamn! Doihh, COOL!";
					}
					if (WeatherPopConstants.EXT_HURR.equalsIgnoreCase(descr)) {
						modDesc = "Dat's a freakigg hurricane! Huh huh!";
					}
					if (WeatherPopConstants.EXT_TORNADO.equalsIgnoreCase(descr)) {
						modDesc = "Dat's a freakigg tornado! Doihh, COOL!";
					}
					if (WeatherPopConstants.EXT_TROP_STORM
							.equalsIgnoreCase(descr)) {
						modDesc = "De TROPICAL STORM is so behy cool! Doihh, COOL!";
					}
					if (WeatherPopConstants.EXT_WINDY.equalsIgnoreCase(descr)) {
						modDesc = "So behy WINDY outside, uh, betteh sit in! Doihh, COOL!";
					}
					if (WeatherPopConstants.RAIN_EXTREME
							.equalsIgnoreCase(descr)) {
						modDesc = "Extreme RAIN f' the, uh, the win! Doihh, COOL!";
					}
					if (WeatherPopConstants.RAIN_HEAVY.equalsIgnoreCase(descr)) {
						modDesc = "Heaby Freakigg RAIN in hehe today! Doihh, COOL!";
					}
					if (WeatherPopConstants.RAIN_HEAVY_INT
							.equalsIgnoreCase(descr)) {
						modDesc = "Heaby intensity RAIN will be cuzd! Huh huh! Yuh!";
					}
					if (WeatherPopConstants.RAIN_HEAVY_INT_SHOW
							.equalsIgnoreCase(descr)) {
						modDesc = "Heaby Intensity RAIN showebuhrs today dude! Huh huh!";
					}
					if (WeatherPopConstants.RAIN_LIGHT.equalsIgnoreCase(descr)) {
						modDesc = "It's a lite rain, behy lite! Doihh, COOL!";
					}
					if (WeatherPopConstants.RAIN_LIGHT_INT_SHOW
							.equalsIgnoreCase(descr)) {
						modDesc = "Lite Intensity RAIN showebuhrs will be happenigg today! YAY! ";
					}
					if (WeatherPopConstants.RAIN_MOD.equalsIgnoreCase(descr)) {
						modDesc = "Modehate RAIN only! Doihh, COOL";
					}
					if (WeatherPopConstants.RAIN_SHOW.equalsIgnoreCase(descr)) {
						modDesc = "Rain Showebuhrs all the, uh, the way! Doihh, COOL!";
					}
					if (WeatherPopConstants.SNOW.equalsIgnoreCase(descr)) {
						modDesc = "SNOW all the, uh, the way! Doihh, COOL!";
					}
					if (WeatherPopConstants.SNOW_HEAVY.equalsIgnoreCase(descr)) {
						modDesc = "Heaby Snow hehe dehe ebehywhehe, duh...uh...?";
					}
					if (WeatherPopConstants.SNOW_LIGHT.equalsIgnoreCase(descr)) {
						modDesc = "Lite Snow all the, uh, the way! Doihh, COOL";
					}
					if (WeatherPopConstants.SNOW_SHOW.equalsIgnoreCase(descr)) {
						modDesc = "SNOW too SHOWER too, duh...uh...?";
					}
					if (WeatherPopConstants.SNOW_SLEET.equalsIgnoreCase(descr)) {
						modDesc = "Snow SLEET, duh...uh...?";
					}
					if (WeatherPopConstants.THUN.equalsIgnoreCase(descr)) {
						modDesc = "OMG DundehStorm! Doihh, COOL!";
					}
					if (WeatherPopConstants.THUN_DRIZ.equalsIgnoreCase(descr)) {
						modDesc = "DundehStorm wid de Drizzle is kinda good! Doihh, COOL!";
					}
					if (WeatherPopConstants.THUN_HEAVY.equalsIgnoreCase(descr)) {
						modDesc = "Heavy Thunnersto'm is a-comin' today, oh no! Fry mah hide!";
					}
					if (WeatherPopConstants.THUN_HEAVY_DRIZ
							.equalsIgnoreCase(descr)) {
						modDesc = "Dundehstorm wid Heaby Drizzle! Huh huh!";
					}
					if (WeatherPopConstants.THUN_HEAVY_RAIN
							.equalsIgnoreCase(descr)) {
						modDesc = "Dundehstorm wid so much heaby Rain! Doihh, COOL!";
					}
					if (WeatherPopConstants.THUN_LIGHT.equalsIgnoreCase(descr)) {
						modDesc = "A small little puny Dundehstorm! Doihh, COOL!";
					}
					if (WeatherPopConstants.THUN_LIGHT_DRIZ
							.equalsIgnoreCase(descr)) {
						modDesc = "Why wudd dehe be Dundehstorm wid lite Drizzle, duh...uh...?";
					}
					if (WeatherPopConstants.THUN_LIGHT_RAIN
							.equalsIgnoreCase(descr)) {
						modDesc = "Hehe comes de Dundehstorm wid lite Rain, duh...uh...?";
					}
					if (WeatherPopConstants.THUN_RAGGED.equalsIgnoreCase(descr)) {
						modDesc = "Raggid Dundehstorm, f' real, duh...uh...?! Doihh, COOL!";
					}
					if (WeatherPopConstants.THUN_RAIN.equalsIgnoreCase(descr)) {
						modDesc = "Dundehstorm wid Rain is errrr, why I lobe today! Doihh, COOL!";
					}
				}

				if (option.equalsIgnoreCase("Texter")) {
					if (WeatherPopConstants.ATM_FOG.equalsIgnoreCase(descr)) {
						modDesc = "THEIR WUD B FOG 2DAY1!!! WTF";
					}
					if (WeatherPopConstants.ATM_HAZE.equalsIgnoreCase(descr)) {
						modDesc = "THEIR WUD B HAEZ 2DAY1!11";
					}
					if (WeatherPopConstants.ATM_MIST.equalsIgnoreCase(descr)) {
						modDesc = "DA ARE IS SO MISTY 2DAY11!11!1 OMG WTF";
					}
					if (WeatherPopConstants.ATM_SAND_DUST
							.equalsIgnoreCase(descr)) {
						modDesc = "SAND AND DUST WHIRLNG TEH SKEIS";
					}
					if (WeatherPopConstants.ATM_SMOKE.equalsIgnoreCase(descr)) {
						modDesc = "DA ARE IS SO SMOKY 2DAY";
					}
					if (WeatherPopConstants.CLD_BROKEN.equalsIgnoreCase(descr)) {
						modDesc = "BROKEN CLOUDS AL AROUND???!?!!?? WTF";
					}
					if (WeatherPopConstants.CLD_CLEAR.equalsIgnoreCase(descr)) {
						modDesc = "DA SKY IS CLEAR AS SHINNG PEICA OF GLAS1!1! LOL";
					}
					if (WeatherPopConstants.CLD_FEW.equalsIgnoreCase(descr)) {
						modDesc = "VARY FEW CLOUDS IN TEH SKY 2DAY111! OMG LOL";
					}
					if (WeatherPopConstants.CLD_OVERCAST
							.equalsIgnoreCase(descr)) {
						modDesc = "DA SKY IS SO OV3RCAST ITS INCREDIBLE!!!1! OMG WTF LOL";
					}
					if (WeatherPopConstants.CLD_SCAT.equalsIgnoreCase(descr)) {
						modDesc = "THEYRE R SCAT3RED CLOUDS IN DA SKY 2DAY1!!11!1 OMG WTF";
					}
					if (WeatherPopConstants.DRIZ.equalsIgnoreCase(descr)) {
						modDesc = "THEIR WUD B DRIZL3 2DAY!!!1! LOL";
					}
					if (WeatherPopConstants.DRIZ_HEAVY_INT
							.equalsIgnoreCase(descr)) {
						modDesc = "HEAVY DRIZLA WIT INTENSITY 2DAY MAN1111!! OMG LOL";
					}
					if (WeatherPopConstants.DRIZ_HEAVY_INT_RAIN
							.equalsIgnoreCase(descr)) {
						modDesc = "HEAVY INTENSITY DRIZL3 WIT RANE HAPENNG!!11!!! OMG";
					}
					if (WeatherPopConstants.DRIZ_LIGHT_INT
							.equalsIgnoreCase(descr)) {
						modDesc = "LIGHT INTENSITY DRIZLA FTW";
					}
					if (WeatherPopConstants.DRIZ_LIGHT_INT_RAIN
							.equalsIgnoreCase(descr)) {
						modDesc = "LIGHT INTENSITY RANE AND DRIZL3!!!!11!! OMG WTF";
					}
					if (WeatherPopConstants.DRIZ_RAIN.equalsIgnoreCase(descr)) {
						modDesc = "RANE AND DRIZLA 2GETH3R NOW!!11!!! LOL";
					}
					if (WeatherPopConstants.DRIZ_SHOWER.equalsIgnoreCase(descr)) {
						modDesc = "SHOWAR DRIZL3 HAPENNG RIGHT NOW!!!!1 OMG LOL";
					}
					if (WeatherPopConstants.EXT_COLD.equalsIgnoreCase(descr)) {
						modDesc = "EXTRAME COLD CONDITIONS HAR31!11!1!!";
					}
					if (WeatherPopConstants.EXT_HAIL.equalsIgnoreCase(descr)) {
						modDesc = "HALES2RM DUDA R U KIDNG M3?!!??? WTF";
					}
					if (WeatherPopConstants.EXT_HOT.equalsIgnoreCase(descr)) {
						modDesc = "SO HOT 2DAY11!!1!!! OMG WTF LOL";
					}
					if (WeatherPopConstants.EXT_HURR.equalsIgnoreCase(descr)) {
						modDesc = "NIEC NOW A HURICAEN!111! WTF LOL";
					}
					if (WeatherPopConstants.EXT_TORNADO.equalsIgnoreCase(descr)) {
						modDesc = "2RNADO! R U KIDNG M3?!?!?? WTF LOL";
					}
					if (WeatherPopConstants.EXT_TROP_STORM
							.equalsIgnoreCase(descr)) {
						modDesc = "TROPICAL S2RM IS ON ITS WAY MAN111!!1!! OMG";
					}
					if (WeatherPopConstants.EXT_WINDY.equalsIgnoreCase(descr)) {
						modDesc = "WINDY WINDY AL DA WAY1!!1!!! LOL";
					}
					if (WeatherPopConstants.RAIN_EXTREME
							.equalsIgnoreCase(descr)) {
						modDesc = "SO MUCH OF DA RANES 2DAY11111 OMG WTF LOL";
					}
					if (WeatherPopConstants.RAIN_HEAVY.equalsIgnoreCase(descr)) {
						modDesc = "SOM3 HAAVY RANE IS BNG CAUSED!!!1!11 OMG WTF";
					}
					if (WeatherPopConstants.RAIN_HEAVY_INT
							.equalsIgnoreCase(descr)) {
						modDesc = "HEAVY INTENSITY RAINS, FTW.";
					}
					if (WeatherPopConstants.RAIN_HEAVY_INT_SHOW
							.equalsIgnoreCase(descr)) {
						modDesc = "HEAVY INTANSITY SHOW3R RANES 2GATHER?!!!?! OMG LOL";
					}
					if (WeatherPopConstants.RAIN_LIGHT.equalsIgnoreCase(descr)) {
						modDesc = "ITS GONG 2 B A LIGHT RANE 2DAY!!!!1 OMG";
					}
					if (WeatherPopConstants.RAIN_LIGHT_INT_SHOW
							.equalsIgnoreCase(descr)) {
						modDesc = "RANE SHOW3R AND WUD HAEV LIGHT INTENSITY FTW1!!! WTF LOL";
					}
					if (WeatherPopConstants.RAIN_MOD.equalsIgnoreCase(descr)) {
						modDesc = "MOD3RAET RANE WUD B DA CAES 2DAY11!!1 OMG WTF LOL";
					}
					if (WeatherPopConstants.RAIN_SHOW.equalsIgnoreCase(descr)) {
						modDesc = "ITS RANE SHOWARS AL TEH WAY1!!11 OMG LOL";
					}
					if (WeatherPopConstants.SNOW.equalsIgnoreCase(descr)) {
						modDesc = "SNOW MAN IS IN DA HOUSE1!!!! LOL";
					}
					if (WeatherPopConstants.SNOW_HEAVY.equalsIgnoreCase(descr)) {
						modDesc = "H3AVY SNOW MAN!1!11 OMG";
					}
					if (WeatherPopConstants.SNOW_LIGHT.equalsIgnoreCase(descr)) {
						modDesc = "LIGHT SNOW IS GONG 2 B THEYRE 2DAY1111 OMG";
					}
					if (WeatherPopConstants.SNOW_SHOW.equalsIgnoreCase(descr)) {
						modDesc = "SNOW SHOWERS AND WUT ELS3?!?!??! WTF";
					}
					if (WeatherPopConstants.SNOW_SLEET.equalsIgnoreCase(descr)) {
						modDesc = "IT WIL B SNOW SLET FOR 2DAY!1!1!1 LOL";
					}
					if (WeatherPopConstants.THUN.equalsIgnoreCase(descr)) {
						modDesc = "THUNDERS2RM!!!!";
					}
					if (WeatherPopConstants.THUN_DRIZ.equalsIgnoreCase(descr)) {
						modDesc = "THUNDERS2RM WIT DRIZL3 AS IF I CAER!11!!1!! WTF";
					}
					if (WeatherPopConstants.THUN_HEAVY.equalsIgnoreCase(descr)) {
						modDesc = "PRATY HAAVY THUNDERS2RM!1!!1!!!";
					}
					if (WeatherPopConstants.THUN_HEAVY_DRIZ
							.equalsIgnoreCase(descr)) {
						modDesc = "THUND3RS2RM WIT H3AVY DRIZLE1!1!11!! WTF";
					}
					if (WeatherPopConstants.THUN_HEAVY_RAIN
							.equalsIgnoreCase(descr)) {
						modDesc = "THUNDERS2RM WIT HAAVY RANE??!!!!! OMG WTF";
					}
					if (WeatherPopConstants.THUN_LIGHT.equalsIgnoreCase(descr)) {
						modDesc = "THUNDARS2RM BUT LIGHT1111!1 OMG";
					}
					if (WeatherPopConstants.THUN_LIGHT_DRIZ
							.equalsIgnoreCase(descr)) {
						modDesc = "THUNDARS2RM BUT LIGHT1111!1 OMG";
					}
					if (WeatherPopConstants.THUN_LIGHT_RAIN
							.equalsIgnoreCase(descr)) {
						modDesc = "THUNDERS2RM WIT LIGHT RANE ON DA SIEDS LOL1!!!!!1 OMG WTF";
					}
					if (WeatherPopConstants.THUN_RAGGED.equalsIgnoreCase(descr)) {
						modDesc = "RAGED THUNDARS2RM FTW!";
					}
					if (WeatherPopConstants.THUN_RAIN.equalsIgnoreCase(descr)) {
						modDesc = "AVOID G3TNG CAUGHT IN TEH THUNDAR RANE!!!111 OMG LOL";
					}
				}
			}

		}
		return modDesc.toUpperCase();
	}
}
