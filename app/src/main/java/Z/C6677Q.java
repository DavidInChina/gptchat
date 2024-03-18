package z;

import Z.AbstractC1704c0;
import Z.AbstractC1710f0;
import Z.M0;
import a0.C1904a;
import a0.C1905b;
import a2.C1919c;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import b0.C2100d;
import d1.C2580o;
import d1.DialogC2582q;
import id.AbstractC3557B;
import na.Q1;
import na.R1;
import p9.C5100b;
import wf.AbstractC6216a;

/* renamed from: z.Q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6677Q extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f51183Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f51184Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f51185h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f51186i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f51187j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6677Q(Number number, C6671K c6671k, Number number2, C6669J c6669j) {
        super(0);
        this.f51183Y = 0;
        this.f51184Z = number;
        this.f51186i0 = c6671k;
        this.f51185h0 = number2;
        this.f51187j0 = c6669j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6677Q(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        super(0);
        this.f51183Y = i10;
        this.f51184Z = obj;
        this.f51185h0 = obj2;
        this.f51186i0 = obj3;
        this.f51187j0 = obj4;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        int i10 = this.f51183Y;
        Object obj = this.f51187j0;
        Object obj2 = this.f51186i0;
        Object obj3 = this.f51185h0;
        Object obj4 = this.f51184Z;
        switch (i10) {
            case 0:
                C6671K c6671k = (C6671K) obj2;
                if (AbstractC3557B.K(obj4, c6671k.f51159Y) && AbstractC3557B.K(obj3, c6671k.f51160Z)) {
                    return;
                }
                Object obj5 = this.f51184Z;
                c6671k.f51159Y = obj5;
                Object obj6 = this.f51185h0;
                c6671k.f51160Z = obj6;
                c6671k.f51163j0 = new C6711m0((C6669J) obj, c6671k.f51161h0, obj5, obj6, null);
                c6671k.f51167n0.f51180b.setValue(Boolean.TRUE);
                c6671k.f51164k0 = false;
                c6671k.f51165l0 = true;
                return;
            case 1:
                Z.r rVar = (Z.r) obj4;
                C1905b c1905b = rVar.f22692L;
                C1904a c1904a = (C1904a) obj3;
                M0 m02 = (M0) obj2;
                AbstractC1704c0 abstractC1704c0 = (AbstractC1704c0) obj;
                C1904a c1904a2 = c1905b.f23808b;
                try {
                    c1905b.f23808b = c1904a;
                    M0 m03 = rVar.f22686F;
                    int[] iArr = rVar.f22709n;
                    C2100d c2100d = rVar.f22716u;
                    rVar.f22709n = null;
                    rVar.f22716u = null;
                    rVar.f22686F = m02;
                    boolean z10 = c1905b.f23811e;
                    try {
                        c1905b.f23811e = false;
                        abstractC1704c0.getClass();
                        abstractC1704c0.getClass();
                        abstractC1704c0.getClass();
                        Z.r.b(rVar, null, null);
                        rVar.f22686F = m03;
                        rVar.f22709n = iArr;
                        rVar.f22716u = c2100d;
                        return;
                    } finally {
                        c1905b.f23811e = z10;
                    }
                } finally {
                    c1905b.f23808b = c1904a2;
                }
            case 2:
                ((DialogC2582q) obj4).g((AbstractC6216a) obj3, (C2580o) obj2, (Z0.l) obj);
                return;
            case 3:
                int f6 = AbstractC6708l.f(R.a.K((String) obj4));
                if (f6 != 0) {
                    if (f6 != 1) {
                        if (f6 == 2) {
                            ((Activity) obj3).startService((Intent) obj2);
                            return;
                        } else if (f6 == 3) {
                            if (Build.VERSION.SDK_INT >= 26) {
                                C1919c.f23854a.a((Activity) obj3, (Intent) obj2);
                                return;
                            } else {
                                ((Activity) obj3).startService((Intent) obj2);
                                return;
                            }
                        } else if (f6 != 4) {
                            return;
                        }
                    }
                    ((Activity) obj3).sendBroadcast((Intent) obj2);
                    return;
                }
                ((Activity) obj3).startActivity((Intent) obj2, (Bundle) obj);
                return;
            case 4:
                Gi.e eVar = (Gi.e) obj4;
                if (eVar instanceof Q1) {
                    ((wf.k) obj3).invoke(((Q1) eVar).f39858k);
                    return;
                } else if (eVar instanceof R1) {
                    ((AbstractC6216a) obj2).mo122invoke();
                    return;
                } else {
                    ((AbstractC6216a) obj).mo122invoke();
                    return;
                }
            case 5:
                ((u9.b) obj4).b();
                ((wf.k) obj3).invoke(gb.g0.f31435a);
                Z0.i iVar = (Z0.i) ((C5100b) obj2).f42762b.getValue();
                if (iVar == null) {
                    return;
                }
                ((w9.j) obj).b(iVar.f22799a);
                return;
            case 6:
                AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) obj;
                if (!AbstractC3557B.K((String) obj4, ((T0.z) abstractC1710f0.getValue()).f16830a.f12512Y)) {
                    ((wf.k) obj3).invoke(((T0.z) abstractC1710f0.getValue()).f16830a.f12512Y);
                    return;
                } else {
                    ((AbstractC6216a) obj2).mo122invoke();
                    return;
                }
            case 7:
                ((wf.k) obj4).invoke(new gb.j0((String) obj3, (String) obj2, (String) obj));
                return;
            default:
                Object systemService = ((Context) obj4).getSystemService("clipboard");
                AbstractC3557B.a0("null cannot be cast to non-null type android.content.ClipboardManager", systemService);
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText((String) obj3, (String) obj2));
                ((AbstractC6216a) obj).mo122invoke();
                return;
        }
    }
}
