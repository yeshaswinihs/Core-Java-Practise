package com.practice.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;


	/*
	 * Complete the function below. Base url:
	 * https://jsonmock.hackerrank.com/api/movies/search/?Title=
	 */
public class ConsumeRESTAPI {

	static String[] getMovieTitles(String substr) throws IOException {

		URL url = new URL("https://jsonmock.hackerrank.com/api/movies/search/?Title=" + substr);

		URLConnection connection = url.openConnection();
		InputStream input = connection.getInputStream();
		
		String result = new BufferedReader(new InputStreamReader(input)).lines().collect(Collectors.joining("\n"));

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		MovieDatabase movieDatabase = gson.fromJson(result, MovieDatabase.class);
		System.out.println(movieDatabase);
		List<Movie> movies = movieDatabase.getData();
		String[] titles = new String[movies.size()];
		int i = 0;
		for (Movie movie : movies) {
			titles[i] = movie.getTitle();
			i++;
		}

		Arrays.sort(titles);
		for (String str : titles) {
			System.out.println(str);
		}

		return titles;
	}

	class MovieDatabase {
		private Long page;
		private Long per_page;
		private Long total;
		private Long total_pages;
		private List<Movie> data;

		public Long getPage() {
			return page;
		}

		public void setPage(Long page) {
			this.page = page;
		}

		public Long getPer_page() {
			return per_page;
		}

		public void setPer_page(Long per_page) {
			this.per_page = per_page;
		}

		public Long getTotal() {
			return total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public Long getTotal_pages() {
			return total_pages;
		}

		public void setTotal_pages(Long total_pages) {
			this.total_pages = total_pages;
		}
		public List<Movie> getData() {
			return data;
		}

		public void setData(List<Movie> data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return "MovieDatabase [page=" + page + ", per_page=" + per_page + ", total=" + total + ", total_pages="
					+ total_pages + ", data=" + data + "]";
		}

	}

	class Movie {
		@SerializedName("Poster")
		String poster;
		@SerializedName("Title")
		String title;
		@SerializedName("Type")
		String type;
		@SerializedName("Year")
		String year;
		@SerializedName("imdbID")
		String imdbID;
		public String getPoster() {
			return poster;
		}

		public void setPoster(String poster) {
			this.poster = poster;
		}
		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}
		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}
		public String getYear() {
			return year;
		}

		public void setYear(String year) {
			this.year = year;
		}
		public String getImdbID() {
			return imdbID;
		}

		public void setImdbID(String imdbID) {
			this.imdbID = imdbID;
		}

		@Override
		public String toString() {
			return "Movie [poster=" + poster + ", title=" + title + ", type=" + type + ", year=" + year + ", imdbID="
					+ imdbID + "]";
		}

	}

	public static void main(String[] args) throws IOException {
		/*Scanner in = new Scanner(System.in);
		final String fileName = System.getenv("OUTPUT_PATH");
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));*/
		String[] res;
		/*String _substr;
		try {
			_substr = in.nextLine();
		} catch (Exception e) {
			_substr = null;
		}*/

		res = getMovieTitles("spider&page=2");
/*		for (String re : res) {
			bw.write(String.valueOf(re));
			bw.newLine();
		}

		bw.close();
*/	}
}
