package m8;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import l8.BinderC4349g;
import l8.C4343a;
import l8.C4351i;

/* loaded from: classes.dex */
public abstract class h extends F7.c {
    @Override // F7.c
    public final boolean j(int i10, Parcel parcel, Parcel parcel2) {
        Parcelable parcelable;
        Integer num = null;
        Parcelable parcelable2 = null;
        if (i10 != 2) {
            if (i10 != 3) {
                return false;
            }
            Parcelable.Creator creator = Bundle.CREATOR;
            int i11 = d.f38970a;
            if (parcel.readInt() != 0) {
                parcelable2 = (Parcelable) creator.createFromParcel(parcel);
            }
            Bundle bundle = (Bundle) parcelable2;
            int dataAvail = parcel.dataAvail();
            if (dataAvail <= 0) {
                BinderC4349g binderC4349g = (BinderC4349g) this;
                binderC4349g.f37875d.f37879a.c(binderC4349g.f37874c);
                binderC4349g.f37873b.e("onCompleteUpdate", new Object[0]);
                return true;
            }
            throw new BadParcelableException(android.gov.nist.core.a.e("Parcel data not fully consumed, unread size: ", dataAvail));
        }
        Parcelable.Creator creator2 = Bundle.CREATOR;
        int i12 = d.f38970a;
        if (parcel.readInt() == 0) {
            parcelable = null;
        } else {
            parcelable = (Parcelable) creator2.createFromParcel(parcel);
        }
        Bundle bundle2 = (Bundle) parcelable;
        int dataAvail2 = parcel.dataAvail();
        if (dataAvail2 <= 0) {
            BinderC4349g binderC4349g2 = (BinderC4349g) this;
            o oVar = binderC4349g2.f37875d.f37879a;
            N7.f fVar = binderC4349g2.f37874c;
            oVar.c(fVar);
            binderC4349g2.f37873b.e("onRequestInfo", new Object[0]);
            if (bundle2.getInt("error.code", -2) != 0) {
                fVar.a(new u7.l(bundle2.getInt("error.code", -2), 1));
            } else {
                bundle2.getInt("version.code", -1);
                int i13 = bundle2.getInt("update.availability");
                bundle2.getInt("install.status", 0);
                if (bundle2.getInt("client.version.staleness", -1) != -1) {
                    num = Integer.valueOf(bundle2.getInt("client.version.staleness"));
                }
                Integer num2 = num;
                bundle2.getInt("in.app.update.priority", 0);
                bundle2.getLong("bytes.downloaded");
                bundle2.getLong("total.bytes.to.download");
                long j6 = bundle2.getLong("additional.size.required");
                C4351i c4351i = binderC4349g2.f37876e.f37882d;
                c4351i.getClass();
                long a5 = C4351i.a(new File(c4351i.f37883a.getFilesDir(), "assetpacks"));
                PendingIntent pendingIntent = (PendingIntent) bundle2.getParcelable("blocking.intent");
                PendingIntent pendingIntent2 = (PendingIntent) bundle2.getParcelable("nonblocking.intent");
                PendingIntent pendingIntent3 = (PendingIntent) bundle2.getParcelable("blocking.destructive.intent");
                PendingIntent pendingIntent4 = (PendingIntent) bundle2.getParcelable("nonblocking.destructive.intent");
                HashMap hashMap = new HashMap();
                ArrayList<Integer> integerArrayList = bundle2.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent");
                HashSet hashSet = new HashSet();
                if (integerArrayList != null) {
                    hashSet.addAll(integerArrayList);
                }
                hashMap.put("blocking.destructive.intent", hashSet);
                ArrayList<Integer> integerArrayList2 = bundle2.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent");
                HashSet hashSet2 = new HashSet();
                if (integerArrayList2 != null) {
                    hashSet2.addAll(integerArrayList2);
                }
                hashMap.put("nonblocking.destructive.intent", hashSet2);
                ArrayList<Integer> integerArrayList3 = bundle2.getIntegerArrayList("update.precondition.failures:blocking.intent");
                HashSet hashSet3 = new HashSet();
                if (integerArrayList3 != null) {
                    hashSet3.addAll(integerArrayList3);
                }
                hashMap.put("blocking.intent", hashSet3);
                ArrayList<Integer> integerArrayList4 = bundle2.getIntegerArrayList("update.precondition.failures:nonblocking.intent");
                HashSet hashSet4 = new HashSet();
                if (integerArrayList4 != null) {
                    hashSet4.addAll(integerArrayList4);
                }
                hashMap.put("nonblocking.intent", hashSet4);
                fVar.b(new C4343a(i13, num2, j6, a5, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, hashMap));
            }
            return true;
        }
        throw new BadParcelableException(android.gov.nist.core.a.e("Parcel data not fully consumed, unread size: ", dataAvail2));
    }
}
