package dh;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: dh.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2695d extends AbstractC2718u {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f28438b;

    /* renamed from: c  reason: collision with root package name */
    public final C2693c f28439c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2695d(KSerializer kSerializer, int i10) {
        super(kSerializer);
        this.f28438b = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                AbstractC3557B.c0("element", kSerializer);
                this.f28439c = new C2693c(kSerializer.getDescriptor(), 1);
                return;
            }
            AbstractC3557B.c0("eSerializer", kSerializer);
            super(kSerializer);
            this.f28439c = new C2693c(kSerializer.getDescriptor(), 3);
            return;
        }
        AbstractC3557B.c0("eSerializer", kSerializer);
        super(kSerializer);
        this.f28439c = new C2693c(kSerializer.getDescriptor(), 2);
    }

    @Override // dh.AbstractC2689a
    public final Object a() {
        switch (this.f28438b) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // dh.AbstractC2689a
    public final int b(Object obj) {
        switch (this.f28438b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                AbstractC3557B.c0("<this>", arrayList);
                return arrayList.size();
            case 1:
                HashSet hashSet = (HashSet) obj;
                AbstractC3557B.c0("<this>", hashSet);
                return hashSet.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                AbstractC3557B.c0("<this>", linkedHashSet);
                return linkedHashSet.size();
        }
    }

    @Override // dh.AbstractC2689a
    public final Object g(Object obj) {
        switch (this.f28438b) {
            case 0:
                AbstractC3557B.c0("<this>", null);
                return new ArrayList((Collection) null);
            case 1:
                AbstractC3557B.c0("<this>", null);
                return new HashSet((Collection) null);
            default:
                AbstractC3557B.c0("<this>", null);
                return new LinkedHashSet((Collection) null);
        }
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return this.f28439c;
    }

    @Override // dh.AbstractC2689a
    public final Object h(Object obj) {
        switch (this.f28438b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                AbstractC3557B.c0("<this>", arrayList);
                return arrayList;
            case 1:
                HashSet hashSet = (HashSet) obj;
                AbstractC3557B.c0("<this>", hashSet);
                return hashSet;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                AbstractC3557B.c0("<this>", linkedHashSet);
                return linkedHashSet;
        }
    }

    @Override // dh.AbstractC2717t
    public final void i(Object obj, int i10, Object obj2) {
        switch (this.f28438b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                AbstractC3557B.c0("<this>", arrayList);
                arrayList.add(i10, obj2);
                return;
            case 1:
                HashSet hashSet = (HashSet) obj;
                AbstractC3557B.c0("<this>", hashSet);
                hashSet.add(obj2);
                return;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                AbstractC3557B.c0("<this>", linkedHashSet);
                linkedHashSet.add(obj2);
                return;
        }
    }
}
