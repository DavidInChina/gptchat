package androidx.core.app;

import I3.a;
import I3.b;
import I3.c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes2.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f24910a;
        boolean z10 = true;
        if (aVar.e(1)) {
            cVar = aVar.g();
        }
        remoteActionCompat.f24910a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f24911b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f8027e);
        }
        remoteActionCompat.f24911b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f24912c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f8027e);
        }
        remoteActionCompat.f24912c = charSequence2;
        remoteActionCompat.f24913d = (PendingIntent) aVar.f(remoteActionCompat.f24913d, 4);
        boolean z11 = remoteActionCompat.f24914e;
        if (aVar.e(5)) {
            if (((b) aVar).f8027e.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        remoteActionCompat.f24914e = z11;
        boolean z12 = remoteActionCompat.f24915f;
        if (aVar.e(6)) {
            if (((b) aVar).f8027e.readInt() == 0) {
                z10 = false;
            }
            z12 = z10;
        }
        remoteActionCompat.f24915f = z12;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f24910a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f24911b;
        aVar.h(2);
        Parcel parcel = ((b) aVar).f8027e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f24912c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f24913d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z10 = remoteActionCompat.f24914e;
        aVar.h(5);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = remoteActionCompat.f24915f;
        aVar.h(6);
        parcel.writeInt(z11 ? 1 : 0);
    }
}
