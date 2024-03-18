package s3;

import android.os.Bundle;
import android.os.Parcelable;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class O extends T {

    /* renamed from: l  reason: collision with root package name */
    public final Class f45261l;

    public O(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls)) {
            try {
                this.f45261l = Class.forName("[L" + cls.getName() + ';');
                return;
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }
        throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
    }

    @Override // s3.T
    public final Object a(Bundle bundle, String str) {
        AbstractC3557B.c0("bundle", bundle);
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        return (Parcelable[]) bundle.get(str);
    }

    @Override // s3.T
    public final String b() {
        return this.f45261l.getName();
    }

    @Override // s3.T
    public final Object c(String str) {
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override // s3.T
    public final void e(Bundle bundle, String str, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        this.f45261l.cast(parcelableArr);
        bundle.putParcelableArray(str, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AbstractC3557B.K(O.class, obj.getClass())) {
            return AbstractC3557B.K(this.f45261l, ((O) obj).f45261l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f45261l.hashCode();
    }
}
