package s3;

import android.os.Bundle;
import android.os.Parcelable;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class P extends T {

    /* renamed from: l  reason: collision with root package name */
    public final Class f45262l;

    public P(Class cls) {
        super(true);
        if (!Parcelable.class.isAssignableFrom(cls) && !Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
        }
        this.f45262l = cls;
    }

    @Override // s3.T
    public final Object a(Bundle bundle, String str) {
        AbstractC3557B.c0("bundle", bundle);
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        return bundle.get(str);
    }

    @Override // s3.T
    public final String b() {
        return this.f45262l.getName();
    }

    @Override // s3.T
    public final Object c(String str) {
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // s3.T
    public final void e(Bundle bundle, String str, Object obj) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        this.f45262l.cast(obj);
        if (obj != null && !(obj instanceof Parcelable)) {
            if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
                return;
            }
            return;
        }
        bundle.putParcelable(str, (Parcelable) obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AbstractC3557B.K(P.class, obj.getClass())) {
            return AbstractC3557B.K(this.f45262l, ((P) obj).f45262l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f45262l.hashCode();
    }
}
