package k5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: k5.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4184j implements Parcelable {

    /* renamed from: Y  reason: collision with root package name */
    public final List f37067Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final List f37066Z = Arrays.asList("com.android.chrome", "com.google.android.apps.chrome", "com.android.chrome.beta", "com.android.chrome.dev");
    public static final Parcelable.Creator<C4184j> CREATOR = new Y2.n(19);

    public C4184j(List list) {
        this.f37067Y = list;
    }

    public static String a(String str, ArrayList arrayList, List list) {
        if (str != null && list.contains(str) && arrayList.contains(str)) {
            return str;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (arrayList.contains(str2)) {
                return str2;
            }
        }
        if (!arrayList.isEmpty()) {
            return (String) arrayList.get(0);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f37067Y);
    }

    public C4184j(Parcel parcel) {
        this.f37067Y = parcel.createStringArrayList();
    }
}
