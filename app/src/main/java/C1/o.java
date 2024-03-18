package c1;

import Z.AbstractC1738u;
import android.content.Context;
import android.view.View;
import androidx.compose.ui.node.Owner;
import fg.Z;
import id.AbstractC3557B;
import kf.t;
import lg.AbstractC4456a;
import wf.AbstractC6216a;
import xg.D;
import xg.EnumC6447b;
import xg.z;

/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f26101Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f26102Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f26103h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f26104i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f26105j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f26106k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ Object f26107l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        super(0);
        this.f26101Y = i11;
        this.f26103h0 = obj;
        this.f26104i0 = obj2;
        this.f26105j0 = obj3;
        this.f26106k0 = obj4;
        this.f26102Z = i10;
        this.f26107l0 = obj5;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f26101Y;
        Object obj = this.f26107l0;
        Object obj2 = this.f26106k0;
        Object obj3 = this.f26105j0;
        Object obj4 = this.f26104i0;
        Object obj5 = this.f26103h0;
        switch (i10) {
            case 0:
                View view = (View) obj;
                AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.node.Owner", view);
                return new q((Context) obj5, (wf.k) obj4, (AbstractC1738u) obj3, (i0.m) obj2, this.f26102Z, (Owner) view).getLayoutNode();
            default:
                return t.K2(((xg.m) ((z) obj5).f50057a.f11536a).f50014e.d((D) obj4, (AbstractC4456a) obj3, (EnumC6447b) obj2, this.f26102Z, (Z) obj));
        }
    }
}
