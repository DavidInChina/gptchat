package W;

import java.util.LinkedHashMap;

/* renamed from: W.l2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1579l2 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ float f20210Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ long f20211Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C1550f3 f20212h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1579l2(float f6, long j6, C1550f3 c1550f3) {
        super(1);
        this.f20210Y = f6;
        this.f20211Z = j6;
        this.f20212h0 = c1550f3;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        C1543e1 c1543e1 = (C1543e1) obj;
        EnumC1555g3 enumC1555g3 = EnumC1555g3.f20078Y;
        float f6 = this.f20210Y;
        c1543e1.f20033a.put(enumC1555g3, Float.valueOf(f6));
        int i10 = (int) (this.f20211Z & 4294967295L);
        float f10 = i10;
        int i11 = (f10 > (f6 / 2) ? 1 : (f10 == (f6 / 2) ? 0 : -1));
        LinkedHashMap linkedHashMap = c1543e1.f20033a;
        if (i11 > 0 && !this.f20212h0.f20060a) {
            linkedHashMap.put(EnumC1555g3.f20080h0, Float.valueOf(f6 / 2.0f));
        }
        if (i10 != 0) {
            linkedHashMap.put(EnumC1555g3.f20079Z, Float.valueOf(Math.max(0.0f, f6 - f10)));
        }
        return jf.y.f36177a;
    }
}
