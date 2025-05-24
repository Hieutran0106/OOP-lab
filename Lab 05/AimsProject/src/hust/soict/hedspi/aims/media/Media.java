package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.exception.PlayerException;

public class Media {

    private int id;
    protected String title;
    private String category;
    private float cost;

    public Media() {
    	
    }
    public Media(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
    public Media(String title) {
        this.title = title;
    }


	public Media(String title, float cost) {
		super();
		this.title = title;
		this.cost = cost;
	}

	public Media(int id, String title) {
 		super();
 		this.id = id;
 		this.title = title;
 	}


    public Media(int id, String title, String category) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
	}


	public Media(int id, String title, String category, float cost) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}


	// Getters and Setters
    public int getId() {
        return id;
    }

 
	public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
         if (this == o) return true;  
        if (o == null || getClass() != o.getClass()) return false;

        Media media = (Media) o; 
        return title != null ? title.equals(media.title) : media.title == null;  
    }
	public void play() throws PlayerException {
		// TODO Auto-generated method stub
		
	}
	public int compareTo(Media other) {
		// TODO Auto-generated method stub
		return 0;
	}
}
