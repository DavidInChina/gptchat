package s3;

import android.os.Bundle;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class S extends T {

    /* renamed from: l  reason: collision with root package name */
    public final Class f45264l;

    public S(Class cls) {
        super(true);
        if (Serializable.class.isAssignableFrom(cls)) {
            if (true ^ cls.isEnum()) {
                this.f45264l = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }

    @Override // s3.T
    public final Object a(Bundle bundle, String str) {
        AbstractC3557B.c0("bundle", bundle);
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        return (Serializable) bundle.get(str);
    }

    @Override // s3.T
    public String b() {
        return this.f45264l.getName();
    }

    @Override // s3.T
    public final void e(Bundle bundle, String str, Object obj) {
        Serializable serializable = (Serializable) obj;
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        AbstractC3557B.c0("value", serializable);
        this.f45264l.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        return AbstractC3557B.K(this.f45264l, ((S) obj).f45264l);
    }

    /* renamed from: f */
    public Serializable c(String str) {
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.f45264l.hashCode();
    }

    public S(Class cls, int i10) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.f45264l = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }
}
