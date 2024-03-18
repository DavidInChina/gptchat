package Hg;

import id.AbstractC3557B;
import kf.AbstractC4277b;
import kf.EnumC4275K;

/* renamed from: Hg.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0729b extends AbstractC4277b {

    /* renamed from: h0  reason: collision with root package name */
    public int f7767h0 = -1;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C0730c f7768i0;

    public C0729b(C0730c c0730c) {
        this.f7768i0 = c0730c;
    }

    @Override // kf.AbstractC4277b
    public final void a() {
        int i10;
        Object[] objArr;
        do {
            i10 = this.f7767h0 + 1;
            this.f7767h0 = i10;
            objArr = this.f7768i0.f7769Y;
            if (i10 >= objArr.length) {
                break;
            }
        } while (objArr[i10] == null);
        if (i10 >= objArr.length) {
            this.f37465Y = EnumC4275K.f37462h0;
            return;
        }
        Object obj = objArr[i10];
        AbstractC3557B.a0("null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl", obj);
        this.f37466Z = obj;
        this.f37465Y = EnumC4275K.f37460Y;
    }
}
