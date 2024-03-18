package dh;

import bh.AbstractC2216f;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.Map;
import kf.AbstractC4268D;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes2.dex */
public abstract class X extends AbstractC2689a {

    /* renamed from: a  reason: collision with root package name */
    public final KSerializer f28430a;

    /* renamed from: b  reason: collision with root package name */
    public final KSerializer f28431b;

    public X(KSerializer kSerializer, KSerializer kSerializer2) {
        this.f28430a = kSerializer;
        this.f28431b = kSerializer2;
    }

    /* renamed from: i */
    public final void f(AbstractC2430a abstractC2430a, int i10, Map map, boolean z10) {
        int i11;
        Object obj;
        AbstractC3557B.c0("builder", map);
        C2681G c2681g = ((C2682H) this).f28396d;
        Object n10 = abstractC2430a.n(c2681g, i10, this.f28430a, null);
        if (z10) {
            i11 = abstractC2430a.t(c2681g);
            if (i11 != i10 + 1) {
                throw new IllegalArgumentException(AbstractC2469q0.i("Value must follow key in a map, index for key: ", i10, ", returned index for value: ", i11).toString());
            }
        } else {
            i11 = i10 + 1;
        }
        boolean containsKey = map.containsKey(n10);
        KSerializer kSerializer = this.f28431b;
        if (containsKey && !(kSerializer.getDescriptor().e() instanceof AbstractC2216f)) {
            obj = abstractC2430a.n(c2681g, i11, kSerializer, AbstractC4268D.Z0(n10, map));
        } else {
            obj = abstractC2430a.n(c2681g, i11, kSerializer, null);
        }
        map.put(n10, obj);
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        AbstractC3557B.c0("encoder", encoder);
        int d10 = d(obj);
        C2681G c2681g = ((C2682H) this).f28396d;
        AbstractC2431b s10 = encoder.s(c2681g, d10);
        Iterator c10 = c(obj);
        int i10 = 0;
        while (c10.hasNext()) {
            Map.Entry entry = (Map.Entry) c10.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i11 = i10 + 1;
            s10.i(c2681g, i10, this.f28430a, key);
            i10 += 2;
            s10.i(c2681g, i11, this.f28431b, value);
        }
        s10.b(c2681g);
    }
}
