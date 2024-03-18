package androidx.appcompat.view;

import D1.AbstractC0360k0;
import android.view.View;
import java.util.ArrayList;
import nf.AbstractC4828h;
import q.z1;

/* loaded from: classes.dex */
public final class l extends AbstractC4828h {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ int f24408p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f24409q;

    /* renamed from: r  reason: collision with root package name */
    public int f24410r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Object f24411s;

    public l(m mVar) {
        this.f24408p = 0;
        this.f24411s = mVar;
        this.f24409q = false;
        this.f24410r = 0;
    }

    @Override // nf.AbstractC4828h, D1.AbstractC0360k0
    public final void b(View view) {
        switch (this.f24408p) {
            case 1:
                this.f24409q = true;
                return;
            default:
                return;
        }
    }

    @Override // nf.AbstractC4828h, D1.AbstractC0360k0
    public final void c() {
        int i10 = this.f24408p;
        Object obj = this.f24411s;
        switch (i10) {
            case 0:
                if (!this.f24409q) {
                    this.f24409q = true;
                    AbstractC0360k0 abstractC0360k0 = (AbstractC0360k0) ((m) obj).f24416e;
                    if (abstractC0360k0 != null) {
                        abstractC0360k0.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((z1) obj).f43598a.setVisibility(0);
                return;
        }
    }

    @Override // D1.AbstractC0360k0
    public final void d() {
        int i10 = this.f24408p;
        Object obj = this.f24411s;
        switch (i10) {
            case 0:
                int i11 = this.f24410r + 1;
                this.f24410r = i11;
                m mVar = (m) obj;
                if (i11 == ((ArrayList) mVar.f24414c).size()) {
                    AbstractC0360k0 abstractC0360k0 = (AbstractC0360k0) mVar.f24416e;
                    if (abstractC0360k0 != null) {
                        abstractC0360k0.d();
                    }
                    this.f24410r = 0;
                    this.f24409q = false;
                    mVar.f24413b = false;
                    return;
                }
                return;
            default:
                if (!this.f24409q) {
                    ((z1) obj).f43598a.setVisibility(this.f24410r);
                    return;
                }
                return;
        }
    }

    public l(z1 z1Var, int i10) {
        this.f24408p = 1;
        this.f24411s = z1Var;
        this.f24410r = i10;
        this.f24409q = false;
    }
}
