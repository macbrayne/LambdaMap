/*
 * Copyright (c) 2021 LambdAurora <aurora42lambda@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package dev.lambdaurora.lambdamap.map.marker;

import java.util.Locale;

/**
 * Represents the source of a marker.
 *
 * @author LambdAurora
 * @version 1.0.0
 * @since 1.0.0
 */
public enum MarkerSource {
	USER,
	FILLED_MAP,
	BANNER;

	public String getId() {
		return this.name().toLowerCase(Locale.ROOT);
	}

	@Override
	public String toString() {
		return this.getId();
	}

	public static MarkerSource fromId(String id) {
		for (MarkerSource source : values()) {
			if (source.getId().equalsIgnoreCase(id))
				return source;
		}
		return USER;
	}
}
