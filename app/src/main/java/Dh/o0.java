package dh;

import Df.AbstractC0405d;
import id.AbstractC3557B;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class o0 extends AbstractC2717t {

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC0405d f28472b;

    /* renamed from: c  reason: collision with root package name */
    public final C2693c f28473c;

    public o0(AbstractC0405d abstractC0405d, KSerializer kSerializer) {
        super(kSerializer);
        this.f28472b = abstractC0405d;
        this.f28473c = new C2693c(kSerializer.getDescriptor(), 0);
    }

    @Override // dh.AbstractC2689a
    public final Object a() {
        return new ArrayList();
    }

    @Override // dh.AbstractC2689a
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        AbstractC3557B.c0("<this>", arrayList);
        return arrayList.size();
    }

    @Override // dh.AbstractC2689a
    public final Iterator c(Object obj) {
        Object[] objArr = (Object[]) obj;
        AbstractC3557B.c0("<this>", objArr);
        return com.google.android.gms.internal.play_billing.N.f0(objArr);
    }

    @Override // dh.AbstractC2689a
    public final int d(Object obj) {
        Object[] objArr = (Object[]) obj;
        AbstractC3557B.c0("<this>", objArr);
        return objArr.length;
    }

    @Override // dh.AbstractC2689a
    public final Object g(Object obj) {
        AbstractC3557B.c0("<this>", null);
        return new ArrayList(kf.q.Q2(null));
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return this.f28473c;
    }

    @Override // dh.AbstractC2689a
    public final Object h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        AbstractC3557B.c0("<this>", arrayList);
        AbstractC0405d abstractC0405d = this.f28472b;
        AbstractC3557B.c0("eClass", abstractC0405d);
        Object newInstance = Array.newInstance(R4.b.k1(abstractC0405d), arrayList.size());
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>", newInstance);
        Object[] array = arrayList.toArray((Object[]) newInstance);
        AbstractC3557B.b0("toArray(...)", array);
        return array;
    }

    @Override // dh.AbstractC2717t
    public final void i(Object obj, int i10, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        AbstractC3557B.c0("<this>", arrayList);
        arrayList.add(i10, obj2);
    }
}
