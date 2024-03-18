package dh;

import bh.C2217g;
import bh.C2224n;
import id.AbstractC3557B;
import java.util.Map;
import jf.C3959i;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes2.dex */
public final class V extends AbstractC2688N {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f28424d;

    /* renamed from: e  reason: collision with root package name */
    public final C2217g f28425e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(KSerializer kSerializer, KSerializer kSerializer2, int i10) {
        super(kSerializer, kSerializer2, 0);
        this.f28424d = i10;
        if (i10 != 1) {
            this.f28425e = Ad.l.O("kotlin.collections.Map.Entry", C2224n.f26017c, new SerialDescriptor[0], new U(kSerializer, kSerializer2, 0));
            return;
        }
        super(kSerializer, kSerializer2, 0);
        this.f28425e = Ad.l.N("kotlin.Pair", new SerialDescriptor[0], new U(kSerializer, kSerializer2, 1));
    }

    @Override // dh.AbstractC2688N
    public final Object a(Object obj) {
        switch (this.f28424d) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC3557B.c0("<this>", entry);
                return entry.getKey();
            default:
                C3959i c3959i = (C3959i) obj;
                AbstractC3557B.c0("<this>", c3959i);
                return c3959i.f36155Y;
        }
    }

    @Override // dh.AbstractC2688N
    public final Object b(Object obj) {
        switch (this.f28424d) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC3557B.c0("<this>", entry);
                return entry.getValue();
            default:
                C3959i c3959i = (C3959i) obj;
                AbstractC3557B.c0("<this>", c3959i);
                return c3959i.f36156Z;
        }
    }

    @Override // dh.AbstractC2688N
    public final Object d(Object obj, Object obj2) {
        switch (this.f28424d) {
            case 0:
                return new T(obj, obj2);
            default:
                return new C3959i(obj, obj2);
        }
    }

    @Override // dh.AbstractC2688N, ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return this.f28425e;
    }
}
