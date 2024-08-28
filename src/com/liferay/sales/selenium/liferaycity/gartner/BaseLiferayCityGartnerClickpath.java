/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.sales.selenium.liferaycity.gartner;

import com.liferay.sales.selenium.api.DriverInitializer;
import com.liferay.sales.selenium.liferaycity.LiferayCityBaseClickpath;

/**
 * @author Riccardo Ferrari
 */
public abstract class BaseLiferayCityGartnerClickpath extends
	LiferayCityBaseClickpath {

	protected final String[] BUSINESS = {
		"Report possible fraud, waste, or other issues on contracts",
		"Report a paid sick leave violation",
		"Register a business"
	};

	protected final String[] CARS = {
		"Get your car back when it has been towed",
		"Report predatory towing",
		"Pay or dispute a ticket"
	};

	protected final String[] CULTURE = {
		"Find a pool",
		"Find a playground or recreation center",
		"Get a library card"
	};

	protected final String[] DIVERSITY = {
		"Apply for a disabled parking permit",
		"Discrimination"
	};

	protected final String[] DIVERSITY_BUSINESS = {
		"Special registration of owned business"
	};

	protected final String[] MENTAL = {
		"City health centers",
		"Find free food or meals",
	};

	protected final String[] MENTAL_ELDER = {
		"Get services for an older adult"
	};

	protected final String[] NEW_AND_MODERN = {
		"Free Public Transport for Elderly People",
		"012 User Information",
		"Card for Young People",
		"Health Card",
		"Electronic Administration",
		"Recognition of Degree of Disability",
		"Recognition of Dependence",
		"Economic Aid for Birth",
		"Aid granted to Public Transport",
		"Large Family Certificate"
	};

	protected final String[] NEW_AND_MODERN_ELDER = {
		"Free Public Transport for Elderly People",
		"Recognition of Degree of Disability",
		"Recognition of Dependence",
		"Aid granted to Public Transport"
	};

	protected final String[] NEW_AND_MODERN_KID = {
		"012 User Information",
		"Card for Young People",
		"Health Card",
		"Electronic Administration",
		"Recognition of Degree of Disability",
		"Economic Aid for Birth",
		"Large Family Certificate"
	};

	protected final String[] NEW_AND_MODERN_BUSINESS = {
		"Electronic Administration",
		"Economic Aid for Birth",
		"Aid granted to Public Transport"
	};

	protected final String[] PAYMENTS = {
		"Tax credits",
		"Payment plans"
	};

	protected final String[] PAYMENTS_BUSINESS = {
		"Tax credits",
		"Payment plans",
		"Business taxes"
	};

	protected final String[] PROPERTY = {
		"Report a problem with a building, lot, or street",
		"Report graffiti",
		"Find property information"
	};

	protected final String[] SAFETY = {
		"After an emergency",
		"Find a police station",
		"Contact animal control"
	};

	protected final String[] STREETS = {
		"Report a missing or damaged manhole cover",
		"Street closures",
		"Report a problem with a street or alley light"
	};

	protected final String[] TREES = {
		"Events in LiferayCity parks",
		"Air quality",
		"Find a playground or recreation center"
	};

	protected final String[] NEWS_LINKS_TEXTS = {
		"Carnival is coming",
		"Commitment to improve technology",
		"LiferayCity opens a new library to citizens",
		"More than 200 older people"
	};

	protected final String[] NEWS_LINKS_TEXTS_KID = {
		"Carnival is coming",
		"LiferayCity opens a new library"
	};

	protected final String[] NEWS_LINKS_TEXTS_ELDER = {
		"LiferayCity opens a new library",
		"More than 200 older people"
	};

	protected final String[] DOCUMENTS = {
		"BOE-A-2021-3982",
		"BOE-A-2021-3983",
		"BOE-A-2021-3986",
		"BOE-S-2021-63",
		"sumari_ca",
		"mapa-metro-2021",
		"Metro Subway North",
		"Metro Subway South",
		"Red de Metro y Metro Ligero",
		"Mapa de Turismo",
		"Public Transport"
	};

	protected final String[] DOCUMENTS_BUSINESS = {
		"BOE-A-2021-3982",
		"BOE-A-2021-3983",
		"BOE-A-2021-3986",
		"BOE-S-2021-63",
		"sumari_ca"
	};

	protected final String[] DOCUMENTS_TRANSPORT = {
		"mapa-metro-2021",
		"Metro Subway North",
		"Metro Subway South",
		"Red de Metro y Metro Ligero",
		"Mapa de Turismo",
		"Public Transport"
	};

	public BaseLiferayCityGartnerClickpath(
		DriverInitializer di, String baseUrl) {
		super(di, baseUrl);
	}

	protected void initSession(String username, String password) {
		resizeBrowser(1536, 835);
		deleteAllCookies();
		doGoTo(utmGenerator.decorateUrl(baseUrl));
		doLogin(username, password);
	}

	protected boolean getChance(double probability) {
		return Math.random() < probability;
	}

}
