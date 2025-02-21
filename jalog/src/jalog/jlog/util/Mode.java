
/*
 * JaLog - Amateur Radio Logging Software
 * 
 * Copyright (C) 2013 minex123
 * Contributor: Ron Kinney (GitHub: septantrionalis) - 2019
 * Update by: Campbell Reed - 2025
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 *
 * --- Modification Notice ---
 * Changes made by Campbell Reed (2025):
 * - Fixed a typo in the FM mode definition to ensure proper mode selection.
 *
 * This modification retains the original GPL licensing terms and ensures that
 * the software remains free and open-source.
 */



package jalog.jlog.util;

/**
 * An enumeration of Mode types.
 * 
 * @author KC0ZPS
 */
public class Mode {

   /**
    * Creates a new Mode.  The constructor is private.  The only instances are the constants
    * instantiated in this module.
    * 
    * @param description   Description of this meeting type.
    */
   private Mode(String description) {
       _description = description ;
   }

   //**********
   // Public methods
   //**********

   /**
    * Returns the IntToObject object.
    * 
    * @return the IntToObject object.
    */
   public static IntToObject getIntToModeType() {
       return _intToModeType ;
   }

   /**
    * Returns the StringToObject object.
    * 
    * @return the StringToObject object.
    */
   public static StringToObject getStrToModeType() {
       return _strToModeType ;
   }

   /**
    * Returns all objects represented by this class as an array.
    * 
    * @return all objects represented by this class as an array.
    */
   public static Mode[] getValues() {
      return _values ;
   }

   //**********
   // Methods overridden from Object
   //**********
   
   /**
    * Returns a string representation of the object.
    * 
    * @return string representation of the object.
    */
   public String toString() {
       return _description ;
   }

   //**********
   // Class attributes and constants
   //**********
   private String                    _description ;
   
   public static final Mode Blank    = new Mode("") ;   
   public static final Mode Unknown  = new Mode("Unknown") ;
   public static final Mode LSB      = new Mode("LSB") ;
   public static final Mode USB      = new Mode("USB") ;
   public static final Mode SSB      = new Mode("SSB") ;
   public static final Mode CW       = new Mode("CW") ;
   public static final Mode FM       = new Mode("FM") ;
   public static final Mode AM       = new Mode("AM") ;
   public static final Mode ASCI     = new Mode("ASCI") ;
   public static final Mode ATV      = new Mode("ATV") ;
   public static final Mode CLO      = new Mode("CLO") ;
   public static final Mode FAX      = new Mode("FAX") ;
   public static final Mode FSK      = new Mode("FSK") ;
   public static final Mode FSK441   = new Mode("FSK441") ;
   public static final Mode GTOR     = new Mode("GTOR") ;
   public static final Mode HELL     = new Mode("HELL") ;
   public static final Mode HFSK     = new Mode("HFSK") ;
   public static final Mode JT44     = new Mode("JT44") ;
   public static final Mode JT65     = new Mode("JT65") ;
   public static final Mode MFSK8    = new Mode("MFSK8") ;
   public static final Mode MFSK16   = new Mode("MFSK16") ;
   public static final Mode MTTY     = new Mode("MTTY") ;
   public static final Mode MT63     = new Mode("MT63") ;
   public static final Mode OLIVIA   = new Mode("OLIVIA") ;
   public static final Mode PAC      = new Mode("PAC") ;
   public static final Mode PAC2     = new Mode("PAC2") ;
   public static final Mode PAC3     = new Mode("PAC3") ;
   public static final Mode PCW      = new Mode("PCW") ;
   public static final Mode PKT      = new Mode("PKT") ;
   public static final Mode PSK31    = new Mode("PSK31") ;
   public static final Mode PSK63    = new Mode("PSK63") ;
   public static final Mode PSK125   = new Mode("PSK125") ;
   public static final Mode Q15      = new Mode("Q15") ;
   public static final Mode RTTY     = new Mode("RTTY") ;
   public static final Mode SSTV     = new Mode("SSTV") ;
   public static final Mode THRB     = new Mode("THRB") ;
   public static final Mode TOR      = new Mode("TOR") ;
   public static final Mode P25      = new Mode("P25") ;
   
   private static final Mode _values[] = {
      Blank,
      // LSB,
      // USB,
      SSB,
      CW,
      FM,
      AM,
      // ASCI,
      ATV,
      CLO,
      // FAX,
      // FSK,
      // FSK441,
      // GTOR,
      // HELL,
      // HFSK,
      // JT44,
      // JT65,
      // MFSK8,
      // MFSK16,
      // MTTY,
      // MT63,
      // OLIVIA,
      PAC,
      // PAC2,
      // PAC3,
      // PCW,
      PKT,
      // PSK31,
      // PSK63,
      // PSK125,
      // Q15,
      RTTY,
      SSTV,
      // THRB,
      TOR,
      P25
   } ;

   /**
    * A mapping of the objects to the constants as Integers.  These valus MUST mimic _values.  ADIF 1.0 only uses a subset
    * of the total enumerations I've defined.  The ones that aren't use are commented out.
    */
   private static final Object[][] _intlookupData = {
      {new Integer(0), Mode.Blank},
      // {new Integer(), Mode.LSB},
      // {new Integer(), Mode.USB},
      {new Integer(1), Mode.SSB},
      {new Integer(2), Mode.CW},
      {new Integer(3), Mode.FM},
      {new Integer(4), Mode.AM},
      // {new Integer(), Mode.ASCI},
      {new Integer(5), Mode.ATV},
      {new Integer(6), Mode.CLO},
      // {new Integer(), Mode.FAX},
      // {new Integer(), Mode.FSK},
      // {new Integer(), Mode.FSK441},
      // {new Integer(), Mode.GTOR},
      // {new Integer(), Mode.HELL},
      // {new Integer(), Mode.HFSK},
      // {new Integer(), Mode.JT44},
      // {new Integer(), Mode.JT65},
      // {new Integer(), Mode.MFSK8},
      // {new Integer(), Mode.MFSK16},
      // {new Integer(), Mode.MTTY},
      // {new Integer(), Mode.MT63},
      // {new Integer(), Mode.OLIVIA},
      {new Integer(7), Mode.PAC},
      // {new Integer(), Mode.PAC2},
      // {new Integer(), Mode.PAC3},
      // {new Integer(), Mode.PCW},
      {new Integer(8), Mode.PKT},
      // {new Integer(), Mode.PSK31},
      // {new Integer(), Mode.PSK63},
      // {new Integer(), Mode.PSK125},
      // {new Integer(), Mode.Q15},
      {new Integer(9), Mode.RTTY},
      {new Integer(10), Mode.SSTV},
      // {new Integer(), Mode.THRB},
      {new Integer(11), Mode.TOR}
   } ;
   
   /**
    * A mapping of the objects to the constants as Strings.  These are the values that are supported by ADIF 1.0.
    */
   private static final Object[][] _strlookupData = {
      {new String(""), Mode.Blank},
      {new String("Unknown"), Mode.Unknown},
      {new String("SSB"), Mode.SSB},
      {new String("CW"), Mode.CW},
      {new String("RTTY"), Mode.RTTY},
      {new String("TOR"), Mode.TOR},
      {new String("PKT"), Mode.PKT},
      {new String("AM"), Mode.AM},
      {new String("FM"), Mode.FM},
      {new String("SSTV"), Mode.SSTV},
      {new String("ATV"), Mode.ATV},
      {new String("PAC"), Mode.PAC},
      {new String("CLO"), Mode.CLO}
   } ;
   
   private static final IntToObject _intToModeType = new IntToObject(_intlookupData, Mode.Unknown) ;
   private static final StringToObject _strToModeType = new StringToObject(_strlookupData, Mode.Unknown) ;
}
