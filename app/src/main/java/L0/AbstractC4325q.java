package l0;

import G0.AbstractC0579h;
import G0.AbstractC0586o;
import G0.g0;
import G0.k0;
import H0.C0714y;
import Ng.AbstractC1073l0;
import Ng.C1071k0;
import Ng.C1079o0;
import Ng.F;
import Sg.C1394f;
import o0.C4875j;
import z.C6685Z;

/* renamed from: l0.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4325q implements AbstractC0586o {

    /* renamed from: Z  reason: collision with root package name */
    public C1394f f37721Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f37722h0;

    /* renamed from: j0  reason: collision with root package name */
    public AbstractC4325q f37724j0;

    /* renamed from: k0  reason: collision with root package name */
    public AbstractC4325q f37725k0;

    /* renamed from: l0  reason: collision with root package name */
    public k0 f37726l0;

    /* renamed from: m0  reason: collision with root package name */
    public g0 f37727m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f37728n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f37729o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f37730p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f37731q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f37732r0;

    /* renamed from: Y  reason: collision with root package name */
    public AbstractC4325q f37720Y = this;

    /* renamed from: i0  reason: collision with root package name */
    public int f37723i0 = -1;

    public final F p0() {
        C1394f c1394f = this.f37721Z;
        if (c1394f == null) {
            C1394f g10 = Ad.l.g(((C0714y) AbstractC0579h.B(this)).getCoroutineContext().plus(new C1079o0((AbstractC1073l0) ((C0714y) AbstractC0579h.B(this)).getCoroutineContext().get(C1071k0.f12951Y))));
            this.f37721Z = g10;
            return g10;
        }
        return c1394f;
    }

    public boolean q0() {
        return !(this instanceof C4875j);
    }

    public void r0() {
        if (!this.f37732r0) {
            if (this.f37727m0 != null) {
                this.f37732r0 = true;
                this.f37730p0 = true;
                return;
            }
            throw new IllegalStateException("attach invoked on a node without a coordinator".toString());
        }
        throw new IllegalStateException("node attached multiple times".toString());
    }

    public void s0() {
        if (this.f37732r0) {
            if (!this.f37730p0) {
                if (!this.f37731q0) {
                    this.f37732r0 = false;
                    C1394f c1394f = this.f37721Z;
                    if (c1394f != null) {
                        Ad.l.P(c1394f, new C6685Z(3));
                        this.f37721Z = null;
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Must run runDetachLifecycle() before markAsDetached()".toString());
            }
            throw new IllegalStateException("Must run runAttachLifecycle() before markAsDetached()".toString());
        }
        throw new IllegalStateException("Cannot detach a node that is not attached".toString());
    }

    public void w0() {
        if (this.f37732r0) {
            v0();
            return;
        }
        throw new IllegalStateException("reset() called on an unattached node".toString());
    }

    public void x0() {
        if (this.f37732r0) {
            if (this.f37730p0) {
                this.f37730p0 = false;
                t0();
                this.f37731q0 = true;
                return;
            }
            throw new IllegalStateException("Must run runAttachLifecycle() only once after markAsAttached()".toString());
        }
        throw new IllegalStateException("Must run markAsAttached() prior to runAttachLifecycle".toString());
    }

    public void y0() {
        if (this.f37732r0) {
            if (this.f37727m0 != null) {
                if (this.f37731q0) {
                    this.f37731q0 = false;
                    u0();
                    return;
                }
                throw new IllegalStateException("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()".toString());
            }
            throw new IllegalStateException("detach invoked on a node without a coordinator".toString());
        }
        throw new IllegalStateException("node detached multiple times".toString());
    }

    public void z0(g0 g0Var) {
        this.f37727m0 = g0Var;
    }

    public void t0() {
    }

    public void u0() {
    }

    public void v0() {
    }
}
