package ah;

import Df.AbstractC0405d;
import ch.AbstractC2430a;
import dh.AbstractC2691b;
import id.AbstractC3557B;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jf.AbstractC3957g;
import jf.EnumC3958h;
import kf.AbstractC4268D;
import kf.q;
import kf.v;
import kotlin.jvm.internal.C;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import ud.C5902a;

/* renamed from: ah.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1996g extends AbstractC2691b {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0405d f24202a;

    /* renamed from: b  reason: collision with root package name */
    public final List f24203b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC3957g f24204c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f24205d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashMap f24206e;

    public C1996g(String str, AbstractC0405d abstractC0405d, AbstractC0405d[] abstractC0405dArr, KSerializer[] kSerializerArr) {
        AbstractC3557B.c0("baseClass", abstractC0405d);
        this.f24202a = abstractC0405d;
        this.f24203b = v.f37483Y;
        this.f24204c = R4.b.C1(EnumC3958h.f36152Y, new C5902a(str, 27, this));
        if (abstractC0405dArr.length == kSerializerArr.length) {
            Map k12 = AbstractC4268D.k1(q.D3(abstractC0405dArr, kSerializerArr));
            this.f24205d = k12;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : k12.entrySet()) {
                String a5 = ((KSerializer) entry.getValue()).getDescriptor().a();
                Object obj = linkedHashMap.get(a5);
                if (obj == null) {
                    linkedHashMap.containsKey(a5);
                }
                Map.Entry entry2 = (Map.Entry) obj;
                if (entry2 != null) {
                    throw new IllegalStateException(("Multiple sealed subclasses of '" + this.f24202a + "' have the same serial name '" + a5 + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
                }
                linkedHashMap.put(a5, entry);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(P4.a.n0(linkedHashMap.size()));
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry3.getKey(), (KSerializer) ((Map.Entry) entry3.getValue()).getValue());
            }
            this.f24206e = linkedHashMap2;
            return;
        }
        throw new IllegalArgumentException("All subclasses of sealed class " + abstractC0405d.o() + " should be marked @Serializable");
    }

    @Override // dh.AbstractC2691b
    public final AbstractC1991b a(AbstractC2430a abstractC2430a, String str) {
        AbstractC3557B.c0("decoder", abstractC2430a);
        KSerializer kSerializer = (KSerializer) this.f24206e.get(str);
        if (kSerializer == null) {
            return super.a(abstractC2430a, str);
        }
        return kSerializer;
    }

    @Override // dh.AbstractC2691b
    public final KSerializer b(Encoder encoder, Object obj) {
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", obj);
        KSerializer kSerializer = (KSerializer) this.f24205d.get(C.f37623a.b(obj.getClass()));
        if (kSerializer == null) {
            kSerializer = super.b(encoder, obj);
        }
        if (kSerializer == null) {
            return null;
        }
        return kSerializer;
    }

    @Override // dh.AbstractC2691b
    public final AbstractC0405d c() {
        return this.f24202a;
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f24204c.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1996g(String str, AbstractC0405d abstractC0405d, AbstractC0405d[] abstractC0405dArr, KSerializer[] kSerializerArr, Annotation[] annotationArr) {
        this(str, abstractC0405d, abstractC0405dArr, kSerializerArr);
        AbstractC3557B.c0("baseClass", abstractC0405d);
        this.f24203b = q.Q2(annotationArr);
    }
}
