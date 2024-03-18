package s8;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import r8.BinderC5375d;
import r8.C5373b;

/* renamed from: s8.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5588e extends F7.c {
    @Override // F7.c
    public final boolean j(int i10, Parcel parcel, Parcel parcel2) {
        Parcelable parcelable;
        if (i10 != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        int i11 = AbstractC5584a.f45441a;
        if (parcel.readInt() == 0) {
            parcelable = null;
        } else {
            parcelable = (Parcelable) creator.createFromParcel(parcel);
        }
        Bundle bundle = (Bundle) parcelable;
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            BinderC5375d binderC5375d = (BinderC5375d) this;
            C5592i c5592i = binderC5375d.f44467d.f44469a;
            if (c5592i != null) {
                N7.f fVar = binderC5375d.f44466c;
                synchronized (c5592i.f45456f) {
                    c5592i.f45455e.remove(fVar);
                }
                synchronized (c5592i.f45456f) {
                    try {
                        if (c5592i.f45461k.get() > 0 && c5592i.f45461k.decrementAndGet() > 0) {
                            c5592i.f45452b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                        } else {
                            c5592i.a().post(new C5591h(0, c5592i));
                        }
                    } finally {
                    }
                }
            }
            binderC5375d.f44465b.d("onGetLaunchReviewFlowInfo", new Object[0]);
            binderC5375d.f44466c.b(new C5373b((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
            return true;
        }
        throw new BadParcelableException(android.gov.nist.core.a.e("Parcel data not fully consumed, unread size: ", dataAvail));
    }
}
