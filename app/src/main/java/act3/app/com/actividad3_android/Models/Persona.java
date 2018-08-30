package act3.app.com.actividad3_android.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class Persona implements Parcelable{
    public String Nombre;
    public String ApellidoP;
    public String ApellidoM;
    public int Edad;

        public Persona(){
            this.Nombre="";
            this.ApellidoP="";
            this.ApellidoM="";
            this.Edad=0;
        }

        public Persona (String Nombre, String ApellidoP, String ApellidoM, int Edad){
            this.Nombre = Nombre;
            this.ApellidoP = ApellidoP;
            this.ApellidoM = ApellidoM;
            this.Edad = Edad;
        }

        @Override
        public int describeContents(){
                return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i){
            parcel.writeString(Nombre);
            parcel.writeString(ApellidoP);
            parcel.writeString(ApellidoM);
            parcel.writeInt(Edad);
        }

        public static final Pacelable.Creator<Persona> CREATOR
                = new new Parcelable.Creator<Persona>(){
                public Persona createFormParcel(Parcel in){
                    return new Persona(in);
                }

                @Override
            public Persona[] newArray(int i){
                    return new Persona[i];
                }
        };

        private Persona(Parcel in){
            this.Nombre = in.readString();
            this.ApellidoP = in.readString();
            this.ApellidoM = in.readString();
            this.Edad = in.readInt();
        }
}
