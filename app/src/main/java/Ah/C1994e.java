package ah;

import Df.AbstractC0405d;
import Uf.A;
import dh.AbstractC2691b;
import id.AbstractC3557B;
import java.lang.annotation.Annotation;
import java.util.List;
import jf.AbstractC3957g;
import jf.EnumC3958h;
import kf.q;
import kf.v;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: ah.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1994e extends AbstractC2691b {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0405d f24197a;

    /* renamed from: b  reason: collision with root package name */
    public final List f24198b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC3957g f24199c;

    public C1994e(AbstractC0405d abstractC0405d) {
        AbstractC3557B.c0("baseClass", abstractC0405d);
        this.f24197a = abstractC0405d;
        this.f24198b = v.f37483Y;
        this.f24199c = R4.b.C1(EnumC3958h.f36152Y, new A(19, this));
    }

    @Override // dh.AbstractC2691b
    public final AbstractC0405d c() {
        return this.f24197a;
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f24199c.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f24197a + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1994e(AbstractC0405d abstractC0405d, Annotation[] annotationArr) {
        this(abstractC0405d);
        AbstractC3557B.c0("baseClass", abstractC0405d);
        this.f24198b = q.Q2(annotationArr);
    }
}
