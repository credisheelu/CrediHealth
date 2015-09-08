
package credihealth.app.com.credihealth.models.auto_suggest.auto_suggest_health;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Speciality {

    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("created_by")
    @Expose
    private Object createdBy;
    @Expose
    private int id;
    @Expose
    private String title;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("articles_meta_tags")
    @Expose
    private String articlesMetaTags;
    @SerializedName("articles_title")
    @Expose
    private String articlesTitle;
    @Expose
    private Object description;
    @SerializedName("doctors_meta_tags")
    @Expose
    private String doctorsMetaTags;
    @SerializedName("doctors_title")
    @Expose
    private String doctorsTitle;
    @SerializedName("faqs_meta_tags")
    @Expose
    private String faqsMetaTags;
    @SerializedName("faqs_title")
    @Expose
    private String faqsTitle;
    @SerializedName("packages_meta_tags")
    @Expose
    private String packagesMetaTags;
    @SerializedName("packages_title")
    @Expose
    private String packagesTitle;
    @SerializedName("speciality_id")
    @Expose
    private Object specialityId;

    /**
     * 
     * @return
     *     The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Speciality withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 
     * @return
     *     The createdBy
     */
    public Object getCreatedBy() {
        return createdBy;
    }

    /**
     * 
     * @param createdBy
     *     The created_by
     */
    public void setCreatedBy(Object createdBy) {
        this.createdBy = createdBy;
    }

    public Speciality withCreatedBy(Object createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * 
     * @return
     *     The id
     */
    public int getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(int id) {
        this.id = id;
    }

    public Speciality withId(int id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public Speciality withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 
     * @return
     *     The updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 
     * @param updatedAt
     *     The updated_at
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Speciality withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 
     * @return
     *     The articlesMetaTags
     */
    public String getArticlesMetaTags() {
        return articlesMetaTags;
    }

    /**
     * 
     * @param articlesMetaTags
     *     The articles_meta_tags
     */
    public void setArticlesMetaTags(String articlesMetaTags) {
        this.articlesMetaTags = articlesMetaTags;
    }

    public Speciality withArticlesMetaTags(String articlesMetaTags) {
        this.articlesMetaTags = articlesMetaTags;
        return this;
    }

    /**
     * 
     * @return
     *     The articlesTitle
     */
    public String getArticlesTitle() {
        return articlesTitle;
    }

    /**
     * 
     * @param articlesTitle
     *     The articles_title
     */
    public void setArticlesTitle(String articlesTitle) {
        this.articlesTitle = articlesTitle;
    }

    public Speciality withArticlesTitle(String articlesTitle) {
        this.articlesTitle = articlesTitle;
        return this;
    }

    /**
     * 
     * @return
     *     The description
     */
    public Object getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(Object description) {
        this.description = description;
    }

    public Speciality withDescription(Object description) {
        this.description = description;
        return this;
    }

    /**
     * 
     * @return
     *     The doctorsMetaTags
     */
    public String getDoctorsMetaTags() {
        return doctorsMetaTags;
    }

    /**
     * 
     * @param doctorsMetaTags
     *     The doctors_meta_tags
     */
    public void setDoctorsMetaTags(String doctorsMetaTags) {
        this.doctorsMetaTags = doctorsMetaTags;
    }

    public Speciality withDoctorsMetaTags(String doctorsMetaTags) {
        this.doctorsMetaTags = doctorsMetaTags;
        return this;
    }

    /**
     * 
     * @return
     *     The doctorsTitle
     */
    public String getDoctorsTitle() {
        return doctorsTitle;
    }

    /**
     * 
     * @param doctorsTitle
     *     The doctors_title
     */
    public void setDoctorsTitle(String doctorsTitle) {
        this.doctorsTitle = doctorsTitle;
    }

    public Speciality withDoctorsTitle(String doctorsTitle) {
        this.doctorsTitle = doctorsTitle;
        return this;
    }

    /**
     * 
     * @return
     *     The faqsMetaTags
     */
    public String getFaqsMetaTags() {
        return faqsMetaTags;
    }

    /**
     * 
     * @param faqsMetaTags
     *     The faqs_meta_tags
     */
    public void setFaqsMetaTags(String faqsMetaTags) {
        this.faqsMetaTags = faqsMetaTags;
    }

    public Speciality withFaqsMetaTags(String faqsMetaTags) {
        this.faqsMetaTags = faqsMetaTags;
        return this;
    }

    /**
     * 
     * @return
     *     The faqsTitle
     */
    public String getFaqsTitle() {
        return faqsTitle;
    }

    /**
     * 
     * @param faqsTitle
     *     The faqs_title
     */
    public void setFaqsTitle(String faqsTitle) {
        this.faqsTitle = faqsTitle;
    }

    public Speciality withFaqsTitle(String faqsTitle) {
        this.faqsTitle = faqsTitle;
        return this;
    }

    /**
     * 
     * @return
     *     The packagesMetaTags
     */
    public String getPackagesMetaTags() {
        return packagesMetaTags;
    }

    /**
     * 
     * @param packagesMetaTags
     *     The packages_meta_tags
     */
    public void setPackagesMetaTags(String packagesMetaTags) {
        this.packagesMetaTags = packagesMetaTags;
    }

    public Speciality withPackagesMetaTags(String packagesMetaTags) {
        this.packagesMetaTags = packagesMetaTags;
        return this;
    }

    /**
     * 
     * @return
     *     The packagesTitle
     */
    public String getPackagesTitle() {
        return packagesTitle;
    }

    /**
     * 
     * @param packagesTitle
     *     The packages_title
     */
    public void setPackagesTitle(String packagesTitle) {
        this.packagesTitle = packagesTitle;
    }

    public Speciality withPackagesTitle(String packagesTitle) {
        this.packagesTitle = packagesTitle;
        return this;
    }

    /**
     * 
     * @return
     *     The specialityId
     */
    public Object getSpecialityId() {
        return specialityId;
    }

    /**
     * 
     * @param specialityId
     *     The speciality_id
     */
    public void setSpecialityId(Object specialityId) {
        this.specialityId = specialityId;
    }

    public Speciality withSpecialityId(Object specialityId) {
        this.specialityId = specialityId;
        return this;
    }

}
