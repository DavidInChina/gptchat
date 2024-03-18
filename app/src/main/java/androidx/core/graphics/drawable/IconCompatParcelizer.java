package androidx.core.graphics.drawable;

import I3.a;
import I3.b;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        int i10 = iconCompat.f24917a;
        if (aVar.e(1)) {
            i10 = ((b) aVar).f8027e.readInt();
        }
        iconCompat.f24917a = i10;
        byte[] bArr = iconCompat.f24919c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f8027e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f24919c = bArr;
        iconCompat.f24920d = aVar.f(iconCompat.f24920d, 3);
        int i11 = iconCompat.f24921e;
        if (aVar.e(4)) {
            i11 = ((b) aVar).f8027e.readInt();
        }
        iconCompat.f24921e = i11;
        int i12 = iconCompat.f24922f;
        if (aVar.e(5)) {
            i12 = ((b) aVar).f8027e.readInt();
        }
        iconCompat.f24922f = i12;
        iconCompat.f24923g = (ColorStateList) aVar.f(iconCompat.f24923g, 6);
        String str = iconCompat.f24925i;
        if (aVar.e(7)) {
            str = ((b) aVar).f8027e.readString();
        }
        iconCompat.f24925i = str;
        String str2 = iconCompat.f24926j;
        if (aVar.e(8)) {
            str2 = ((b) aVar).f8027e.readString();
        }
        iconCompat.f24926j = str2;
        iconCompat.f24924h = PorterDuff.Mode.valueOf(iconCompat.f24925i);
        switch (iconCompat.f24917a) {
            case -1:
                Parcelable parcelable = iconCompat.f24920d;
                if (parcelable != null) {
                    iconCompat.f24918b = parcelable;
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid icon");
                }
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f24920d;
                if (parcelable2 != null) {
                    iconCompat.f24918b = parcelable2;
                    break;
                } else {
                    byte[] bArr3 = iconCompat.f24919c;
                    iconCompat.f24918b = bArr3;
                    iconCompat.f24917a = 3;
                    iconCompat.f24921e = 0;
                    iconCompat.f24922f = bArr3.length;
                    break;
                }
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f24919c, Charset.forName("UTF-16"));
                iconCompat.f24918b = str3;
                if (iconCompat.f24917a == 2 && iconCompat.f24926j == null) {
                    iconCompat.f24926j = str3.split(":", -1)[0];
                    break;
                }
                break;
            case 3:
                iconCompat.f24918b = iconCompat.f24919c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f24925i = iconCompat.f24924h.name();
        switch (iconCompat.f24917a) {
            case -1:
                iconCompat.f24920d = (Parcelable) iconCompat.f24918b;
                break;
            case 1:
            case 5:
                iconCompat.f24920d = (Parcelable) iconCompat.f24918b;
                break;
            case 2:
                iconCompat.f24919c = ((String) iconCompat.f24918b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f24919c = (byte[]) iconCompat.f24918b;
                break;
            case 4:
            case 6:
                iconCompat.f24919c = iconCompat.f24918b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i10 = iconCompat.f24917a;
        if (-1 != i10) {
            aVar.h(1);
            ((b) aVar).f8027e.writeInt(i10);
        }
        byte[] bArr = iconCompat.f24919c;
        if (bArr != null) {
            aVar.h(2);
            int length = bArr.length;
            Parcel parcel = ((b) aVar).f8027e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f24920d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f8027e.writeParcelable(parcelable, 0);
        }
        int i11 = iconCompat.f24921e;
        if (i11 != 0) {
            aVar.h(4);
            ((b) aVar).f8027e.writeInt(i11);
        }
        int i12 = iconCompat.f24922f;
        if (i12 != 0) {
            aVar.h(5);
            ((b) aVar).f8027e.writeInt(i12);
        }
        ColorStateList colorStateList = iconCompat.f24923g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f8027e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f24925i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f8027e.writeString(str);
        }
        String str2 = iconCompat.f24926j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f8027e.writeString(str2);
        }
    }
}
