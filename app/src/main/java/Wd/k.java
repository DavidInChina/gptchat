package Wd;

import id.AbstractC3557B;
import java.util.concurrent.ConcurrentSkipListSet;

/* loaded from: classes2.dex */
public final class k extends c {
    @Override // Wd.c
    public final void b(h hVar) {
        this.f20933i.e("AudioSwitch", "onActivate(" + hVar + ')');
        boolean z10 = hVar instanceof d;
        i iVar = this.f20934j;
        if (z10) {
            iVar.b(false);
            iVar.a(true);
        } else if ((hVar instanceof e) || (hVar instanceof g)) {
            iVar.b(false);
            iVar.a(false);
        } else if (hVar instanceof f) {
            iVar.a(false);
            iVar.b(true);
        }
    }

    public final void f() {
        this.f20933i.e("AudioSwitch", "onDeactivate");
        if (this.f20929e instanceof d) {
            this.f20934j.a(false);
        }
    }

    public final void g(h hVar) {
        boolean z10;
        AbstractC3557B.c0("audioDevice", hVar);
        this.f20933i.e("AudioSwitch", "onDeviceDisconnected(" + hVar + ')');
        ConcurrentSkipListSet concurrentSkipListSet = this.f20930f;
        boolean remove = concurrentSkipListSet.remove(hVar);
        if (AbstractC3557B.K(this.f20928d, hVar)) {
            this.f20928d = null;
        }
        if ((hVar instanceof g) && this.f20934j.c()) {
            if (!concurrentSkipListSet.add(new e()) && !remove) {
                z10 = false;
            } else {
                z10 = true;
            }
            remove = z10;
        }
        c.d(this, remove);
    }
}
