// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.8.3,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.model;

/**
 * Modifications to the build process which is activated based on
 * environmental
 *         parameters or command line arguments.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class Profile
    extends ModelBase
    implements java.io.Serializable, java.lang.Cloneable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The identifier of this build profile. This is used for
     * command line
     *             activation, and identifies profiles to be
     * merged.
     *           
     */
    private String id = "default";

    /**
     * The conditional logic which will automatically trigger the
     * inclusion of this
     *             profile.
     */
    private Activation activation;

    /**
     * Information required to build the project.
     */
    private BuildBase build;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method clone.
     * 
     * @return Profile
     */
    public Profile clone()
    {
        try
        {
            Profile copy = (Profile) super.clone();

            if ( this.activation != null )
            {
                copy.activation = (Activation) this.activation.clone();
            }

            if ( this.build != null )
            {
                copy.build = (BuildBase) this.build.clone();
            }

            return copy;
        }
        catch ( java.lang.Exception ex )
        {
            throw (java.lang.RuntimeException) new java.lang.UnsupportedOperationException( getClass().getName()
                + " does not support clone()" ).initCause( ex );
        }
    } //-- Profile clone()

    /**
     * Get the conditional logic which will automatically trigger
     * the inclusion of this
     *             profile.
     * 
     * @return Activation
     */
    public Activation getActivation()
    {
        return this.activation;
    } //-- Activation getActivation()

    /**
     * Get information required to build the project.
     * 
     * @return BuildBase
     */
    public BuildBase getBuild()
    {
        return this.build;
    } //-- BuildBase getBuild()

    /**
     * Get the identifier of this build profile. This is used for
     * command line
     *             activation, and identifies profiles to be
     * merged.
     * 
     * @return String
     */
    public String getId()
    {
        return this.id;
    } //-- String getId()

    /**
     * Set the conditional logic which will automatically trigger
     * the inclusion of this
     *             profile.
     * 
     * @param activation
     */
    public void setActivation( Activation activation )
    {
        this.activation = activation;
    } //-- void setActivation( Activation )

    /**
     * Set information required to build the project.
     * 
     * @param build
     */
    public void setBuild( BuildBase build )
    {
        this.build = build;
    } //-- void setBuild( BuildBase )

    /**
     * Set the identifier of this build profile. This is used for
     * command line
     *             activation, and identifies profiles to be
     * merged.
     * 
     * @param id
     */
    public void setId( String id )
    {
        this.id = id;
    } //-- void setId( String )

    
            
    public static final String SOURCE_POM = "pom";

    public static final String SOURCE_SETTINGS = "settings.xml";

    // We don't want this to be parseable...it's sort of 'hidden'
    // default source for this profile is in the pom itself.
    private String source = SOURCE_POM;

    public void setSource( String source )
    {
        this.source = source;
    }

    public String getSource()
    {
        return source;
    }

    /**
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        return "Profile {id: " + getId() + ", source: " + getSource() + "}";
    }
            
          
}
