package s3;

import android.os.Bundle;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class Q extends T {

    /* renamed from: l  reason: collision with root package name */
    public final Class f45263l;

    public Q(Class cls) {
        super(true);
        if (Serializable.class.isAssignableFrom(cls)) {
            try {
                this.f45263l = Class.forName("[L" + cls.getName() + ';');
                return;
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }

    @Override // s3.T
    public final Object a(Bundle bundle, String str) {
        AbstractC3557B.c0("bundle", bundle);
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        return (Serializable[]) bundle.get(str);
    }

    @Override // s3.T
    public final String b() {
        return this.f45263l.getName();
    }

    @Override // s3.T
    public final Object c(String str) {
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.io.Serializable[], java.io.Serializable] */
    @Override // s3.T
    public final void e(Bundle bundle, String str, Object obj) {
        ?? r42 = (Serializable[]) obj;
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        this.f45263l.cast(r42);
        bundle.putSerializable(str, r42);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AbstractC3557B.K(Q.class, obj.getClass())) {
            return AbstractC3557B.K(this.f45263l, ((Q) obj).f45263l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f45263l.hashCode();
    }
}
