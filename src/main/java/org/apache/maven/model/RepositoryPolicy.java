// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 2.0.0,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.model;

/**
 * Download policy.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class RepositoryPolicy
    implements java.io.Serializable, Cloneable, InputLocationTracker
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * 
     *             
     *             Whether to use this repository for downloading
     * this type of artifact. Note: While the type
     *             of this field is <code>String</code> for
     * technical reasons, the semantic type is actually
     *             <code>Boolean</code>. Default value is
     * <code>true</code>.
     *             
     *           
     */
    private String enabled;

    /**
     * 
     *             
     *             The frequency for downloading updates - can be
     *             <code>always,</code>
     *             <code>daily</code>
     *             (default),
     *             <code>interval:XXX</code>
     *             (in minutes) or
     *             <code>never</code>
     *             (only if it doesn't exist locally).
     *             
     *           
     */
    private String updatePolicy;

    /**
     * 
     *             
     *             What to do when verification of an artifact
     * checksum fails. Valid values are
     *             <code>ignore</code>
     *             ,
     *             <code>fail</code>
     *             or
     *             <code>warn</code>
     *             (the default).
     *             
     *           
     */
    private String checksumPolicy;

    /**
     * Field locations.
     */
    private java.util.Map<Object, InputLocation> locations;

    /**
     * Field location.
     */
    private InputLocation location;

    /**
     * Field enabledLocation.
     */
    private InputLocation enabledLocation;

    /**
     * Field updatePolicyLocation.
     */
    private InputLocation updatePolicyLocation;

    /**
     * Field checksumPolicyLocation.
     */
    private InputLocation checksumPolicyLocation;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method clone.
     * 
     * @return RepositoryPolicy
     */
    public RepositoryPolicy clone()
    {
        try
        {
            RepositoryPolicy copy = (RepositoryPolicy) super.clone();

            if ( copy.locations != null )
            {
                copy.locations = new java.util.LinkedHashMap( copy.locations );
            }

            return copy;
        }
        catch ( Exception ex )
        {
            throw (RuntimeException) new UnsupportedOperationException( getClass().getName()
                + " does not support clone()" ).initCause( ex );
        }
    } //-- RepositoryPolicy clone()

    /**
     * Get what to do when verification of an artifact checksum
     * fails. Valid values are
     *             <code>ignore</code>
     *             ,
     *             <code>fail</code>
     *             or
     *             <code>warn</code>
     *             (the default).
     * 
     * @return String
     */
    public String getChecksumPolicy()
    {
        return this.checksumPolicy;
    } //-- String getChecksumPolicy()

    /**
     * Get whether to use this repository for downloading this type
     * of artifact. Note: While the type
     *             of this field is <code>String</code> for
     * technical reasons, the semantic type is actually
     *             <code>Boolean</code>. Default value is
     * <code>true</code>.
     * 
     * @return String
     */
    public String getEnabled()
    {
        return this.enabled;
    } //-- String getEnabled()

    /**
     * 
     * 
     * @param key a key object.
     * @return InputLocation
     */
    public InputLocation getLocation( Object key )
    {
        if ( key instanceof String )
        {
            switch ( ( String ) key )
            {
                case "" :
                {
                    return this.location;
                }
                case "enabled" :
                {
                    return enabledLocation;
                }
                case "updatePolicy" :
                {
                    return updatePolicyLocation;
                }
                case "checksumPolicy" :
                {
                    return checksumPolicyLocation;
                }
                default :
                {
                    return getOtherLocation( key );
                }
                }
            }
            else
            {
                return getOtherLocation( key );
            }
    } //-- InputLocation getLocation( Object )

    /**
     * 
     * 
     * @param key a key object.
     * @param location a location object.
     */
    public void setLocation( Object key, InputLocation location )
    {
        if ( key instanceof String )
        {
            switch ( ( String ) key )
            {
                case "" :
                {
                    this.location = location;
                    return;
                }
                case "enabled" :
                {
                    enabledLocation = location;
                    return;
                }
                case "updatePolicy" :
                {
                    updatePolicyLocation = location;
                    return;
                }
                case "checksumPolicy" :
                {
                    checksumPolicyLocation = location;
                    return;
                }
                default :
                {
                    setOtherLocation( key, location );
                    return;
                }
            }
        }
        else
        {
            setOtherLocation( key, location );
        }
    } //-- void setLocation( Object, InputLocation )

    /**
     * 
     * 
     * @param key a key object.
     * @param location a location object.
     */
    public void setOtherLocation( Object key, InputLocation location )
    {
        if ( location != null )
        {
            if ( this.locations == null )
            {
                this.locations = new java.util.LinkedHashMap<Object, InputLocation>();
            }
            this.locations.put( key, location );
        }
    } //-- void setOtherLocation( Object, InputLocation )

    /**
     * 
     * 
     * @param key a key object.
     * @return InputLocation
     */
    private InputLocation getOtherLocation( Object key )
    {
        return ( locations != null ) ? locations.get( key ) : null;
    } //-- InputLocation getOtherLocation( Object )

    /**
     * Get the frequency for downloading updates - can be
     *             <code>always,</code>
     *             <code>daily</code>
     *             (default),
     *             <code>interval:XXX</code>
     *             (in minutes) or
     *             <code>never</code>
     *             (only if it doesn't exist locally).
     * 
     * @return String
     */
    public String getUpdatePolicy()
    {
        return this.updatePolicy;
    } //-- String getUpdatePolicy()

    /**
     * Set what to do when verification of an artifact checksum
     * fails. Valid values are
     *             <code>ignore</code>
     *             ,
     *             <code>fail</code>
     *             or
     *             <code>warn</code>
     *             (the default).
     * 
     * @param checksumPolicy a checksumPolicy object.
     */
    public void setChecksumPolicy( String checksumPolicy )
    {
        this.checksumPolicy = checksumPolicy;
    } //-- void setChecksumPolicy( String )

    /**
     * Set whether to use this repository for downloading this type
     * of artifact. Note: While the type
     *             of this field is <code>String</code> for
     * technical reasons, the semantic type is actually
     *             <code>Boolean</code>. Default value is
     * <code>true</code>.
     * 
     * @param enabled a enabled object.
     */
    public void setEnabled( String enabled )
    {
        this.enabled = enabled;
    } //-- void setEnabled( String )

    /**
     * Set the frequency for downloading updates - can be
     *             <code>always,</code>
     *             <code>daily</code>
     *             (default),
     *             <code>interval:XXX</code>
     *             (in minutes) or
     *             <code>never</code>
     *             (only if it doesn't exist locally).
     * 
     * @param updatePolicy a updatePolicy object.
     */
    public void setUpdatePolicy( String updatePolicy )
    {
        this.updatePolicy = updatePolicy;
    } //-- void setUpdatePolicy( String )

    
            

    public boolean isEnabled()
    {
        return ( enabled != null ) ? Boolean.parseBoolean( enabled ) : true;
    }

    public void setEnabled( boolean enabled )
    {
        this.enabled = String.valueOf( enabled );
    }

            
          
}