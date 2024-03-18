package androidx.compose.ui.input.pointer;

import B0.P;
import G0.X;
import L.x0;
import id.AbstractC3557B;
import java.util.Arrays;
import kotlin.Metadata;
import l0.AbstractC4325q;
import wf.n;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;", "LG0/X;", "LB0/P;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final Object f24817b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f24818c;

    /* renamed from: d  reason: collision with root package name */
    public final Object[] f24819d;

    /* renamed from: e  reason: collision with root package name */
    public final n f24820e;

    public SuspendPointerInputElement(Object obj, x0 x0Var, n nVar, int i10) {
        x0Var = (i10 & 2) != 0 ? null : x0Var;
        this.f24817b = obj;
        this.f24818c = x0Var;
        this.f24819d = null;
        this.f24820e = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!AbstractC3557B.K(this.f24817b, suspendPointerInputElement.f24817b) || !AbstractC3557B.K(this.f24818c, suspendPointerInputElement.f24818c)) {
            return false;
        }
        Object[] objArr = this.f24819d;
        if (objArr != null) {
            Object[] objArr2 = suspendPointerInputElement.f24819d;
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (suspendPointerInputElement.f24819d != null) {
            return false;
        }
        return true;
    }

    @Override // G0.X
    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        Object obj = this.f24817b;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = i10 * 31;
        Object obj2 = this.f24818c;
        if (obj2 != null) {
            i11 = obj2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        Object[] objArr = this.f24819d;
        if (objArr != null) {
            i12 = Arrays.hashCode(objArr);
        }
        return i14 + i12;
    }

    @Override // G0.X
    public final AbstractC4325q j() {
        return new P(this.f24820e);
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        P p10 = (P) abstractC4325q;
        p10.C0();
        p10.f1617s0 = this.f24820e;
    }
}
