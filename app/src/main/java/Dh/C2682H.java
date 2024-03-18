package dh;

import id.AbstractC3557B;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: dh.H  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2682H extends X {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f28395c;

    /* renamed from: d  reason: collision with root package name */
    public final C2681G f28396d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2682H(KSerializer kSerializer, KSerializer kSerializer2, int i10) {
        super(kSerializer, kSerializer2);
        this.f28395c = i10;
        if (i10 != 1) {
            AbstractC3557B.c0("kSerializer", kSerializer);
            AbstractC3557B.c0("vSerializer", kSerializer2);
            this.f28396d = new C2681G(kSerializer.getDescriptor(), kSerializer2.getDescriptor(), 0);
            return;
        }
        AbstractC3557B.c0("kSerializer", kSerializer);
        AbstractC3557B.c0("vSerializer", kSerializer2);
        super(kSerializer, kSerializer2);
        this.f28396d = new C2681G(kSerializer.getDescriptor(), kSerializer2.getDescriptor(), 1);
    }

    @Override // dh.AbstractC2689a
    public final Object a() {
        switch (this.f28395c) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // dh.AbstractC2689a
    public final int b(Object obj) {
        switch (this.f28395c) {
            case 0:
                HashMap hashMap = (HashMap) obj;
                AbstractC3557B.c0("<this>", hashMap);
                return hashMap.size() * 2;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                AbstractC3557B.c0("<this>", linkedHashMap);
                return linkedHashMap.size() * 2;
        }
    }

    @Override // dh.AbstractC2689a
    public final Iterator c(Object obj) {
        int i10 = this.f28395c;
        switch (i10) {
            case 0:
                Map map = (Map) obj;
                switch (i10) {
                    case 0:
                        AbstractC3557B.c0("<this>", map);
                        return map.entrySet().iterator();
                    default:
                        AbstractC3557B.c0("<this>", map);
                        return map.entrySet().iterator();
                }
            default:
                Map map2 = (Map) obj;
                switch (i10) {
                    case 0:
                        AbstractC3557B.c0("<this>", map2);
                        return map2.entrySet().iterator();
                    default:
                        AbstractC3557B.c0("<this>", map2);
                        return map2.entrySet().iterator();
                }
        }
    }

    @Override // dh.AbstractC2689a
    public final int d(Object obj) {
        int i10 = this.f28395c;
        switch (i10) {
            case 0:
                Map map = (Map) obj;
                switch (i10) {
                    case 0:
                        AbstractC3557B.c0("<this>", map);
                        return map.size();
                    default:
                        AbstractC3557B.c0("<this>", map);
                        return map.size();
                }
            default:
                Map map2 = (Map) obj;
                switch (i10) {
                    case 0:
                        AbstractC3557B.c0("<this>", map2);
                        return map2.size();
                    default:
                        AbstractC3557B.c0("<this>", map2);
                        return map2.size();
                }
        }
    }

    @Override // dh.AbstractC2689a
    public final Object g(Object obj) {
        switch (this.f28395c) {
            case 0:
                AbstractC3557B.c0("<this>", null);
                return new HashMap((Map) null);
            default:
                AbstractC3557B.c0("<this>", null);
                return new LinkedHashMap((Map) null);
        }
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return this.f28396d;
    }

    @Override // dh.AbstractC2689a
    public final Object h(Object obj) {
        switch (this.f28395c) {
            case 0:
                HashMap hashMap = (HashMap) obj;
                AbstractC3557B.c0("<this>", hashMap);
                return hashMap;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                AbstractC3557B.c0("<this>", linkedHashMap);
                return linkedHashMap;
        }
    }
}
