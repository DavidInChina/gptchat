package z0;

import android.view.KeyEvent;
import l0.AbstractC4325q;
import wf.k;

/* renamed from: z0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6741d extends AbstractC4325q implements AbstractC6740c {

    /* renamed from: s0  reason: collision with root package name */
    public k f51433s0;

    /* renamed from: t0  reason: collision with root package name */
    public k f51434t0;

    @Override // z0.AbstractC6740c
    public final boolean j(KeyEvent keyEvent) {
        k kVar = this.f51434t0;
        if (kVar != null) {
            return ((Boolean) kVar.invoke(new C6739b(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // z0.AbstractC6740c
    public final boolean x(KeyEvent keyEvent) {
        k kVar = this.f51433s0;
        if (kVar != null) {
            return ((Boolean) kVar.invoke(new C6739b(keyEvent))).booleanValue();
        }
        return false;
    }
}
