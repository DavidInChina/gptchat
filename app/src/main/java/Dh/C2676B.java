package dh;

import ch.AbstractC2430a;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import id.AbstractC3557B;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import jf.AbstractC3957g;
import jf.EnumC3958h;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import ud.C5902a;

/* renamed from: dh.B  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2676B implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f28376a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC3957g f28377b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f28378c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f28379d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2676B(String str, Object obj, Annotation[] annotationArr) {
        this(str, obj);
        this.f28376a = 1;
        AbstractC3557B.c0("objectInstance", obj);
        this.f28379d = kf.q.Q2(annotationArr);
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        int i10 = this.f28376a;
        Object obj = this.f28378c;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("decoder", decoder);
                int f6 = decoder.f(getDescriptor());
                if (f6 >= 0) {
                    Enum[] enumArr = (Enum[]) obj;
                    if (f6 < enumArr.length) {
                        return enumArr[f6];
                    }
                }
                throw new IllegalArgumentException(f6 + " is not among valid " + getDescriptor().a() + " enum values, values size is " + ((Enum[]) obj).length);
            default:
                AbstractC3557B.c0("decoder", decoder);
                SerialDescriptor descriptor = getDescriptor();
                AbstractC2430a c10 = decoder.c(descriptor);
                int t10 = c10.t(getDescriptor());
                if (t10 == -1) {
                    c10.b(descriptor);
                    return obj;
                }
                throw new IllegalArgumentException(android.gov.nist.core.a.e("Unexpected index ", t10));
        }
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        AbstractC3957g abstractC3957g = this.f28377b;
        switch (this.f28376a) {
            case 0:
                return (SerialDescriptor) abstractC3957g.getValue();
            default:
                return (SerialDescriptor) abstractC3957g.getValue();
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        switch (this.f28376a) {
            case 0:
                Enum r52 = (Enum) obj;
                AbstractC3557B.c0("encoder", encoder);
                AbstractC3557B.c0("value", r52);
                Enum[] enumArr = (Enum[]) this.f28378c;
                int o32 = kf.q.o3(r52, enumArr);
                if (o32 != -1) {
                    encoder.t(getDescriptor(), o32);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(r52);
                sb2.append(" is not a valid enum ");
                sb2.append(getDescriptor().a());
                sb2.append(", must be one of ");
                String arrays = Arrays.toString(enumArr);
                AbstractC3557B.b0("toString(...)", arrays);
                sb2.append(arrays);
                throw new IllegalArgumentException(sb2.toString());
            default:
                AbstractC3557B.c0("encoder", encoder);
                AbstractC3557B.c0("value", obj);
                encoder.c(getDescriptor()).b(getDescriptor());
                return;
        }
    }

    public final String toString() {
        switch (this.f28376a) {
            case 0:
                return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().a() + '>';
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2676B(String str, Enum[] enumArr, C2675A c2675a) {
        this(str, enumArr);
        this.f28376a = 0;
        AbstractC3557B.c0(DiagnosticsEntry.Histogram.VALUES_KEY, enumArr);
        this.f28379d = c2675a;
    }

    public C2676B(String str, Object obj) {
        this.f28376a = 1;
        AbstractC3557B.c0("objectInstance", obj);
        this.f28378c = obj;
        this.f28379d = kf.v.f37483Y;
        this.f28377b = R4.b.C1(EnumC3958h.f36152Y, new C2700f0(str, 0, this));
    }

    public C2676B(String str, Enum[] enumArr) {
        this.f28376a = 0;
        AbstractC3557B.c0(DiagnosticsEntry.Histogram.VALUES_KEY, enumArr);
        this.f28378c = enumArr;
        this.f28377b = R4.b.D1(new C5902a(this, 29, str));
    }
}
