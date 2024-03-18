package O3;

import L3.s;
import V3.n;
import V3.p;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* loaded from: classes2.dex */
public final class h implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f13373Y;

    /* renamed from: Z  reason: collision with root package name */
    public final j f13374Z;

    public /* synthetic */ h(j jVar, int i10) {
        this.f13373Y = i10;
        this.f13374Z = jVar;
    }

    private void a() {
        X3.a aVar;
        h hVar;
        synchronized (this.f13374Z.f13382l0) {
            j jVar = this.f13374Z;
            jVar.f13383m0 = (Intent) jVar.f13382l0.get(0);
        }
        Intent intent = this.f13374Z.f13383m0;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = this.f13374Z.f13383m0.getIntExtra("KEY_START_ID", 0);
            s d10 = s.d();
            String str = j.f13375p0;
            d10.a(str, "Processing command " + this.f13374Z.f13383m0 + ", " + intExtra);
            Context context = this.f13374Z.f13376Y;
            PowerManager.WakeLock a5 = p.a(context, action + " (" + intExtra + Separators.RPAREN);
            try {
                s d11 = s.d();
                d11.a(str, "Acquiring operation wake lock (" + action + ") " + a5);
                a5.acquire();
                j jVar2 = this.f13374Z;
                jVar2.f13381k0.c(jVar2.f13383m0, intExtra, jVar2);
                s d12 = s.d();
                d12.a(str, "Releasing operation wake lock (" + action + ") " + a5);
                a5.release();
                j jVar3 = this.f13374Z;
                aVar = jVar3.f13377Z.f21782d;
                hVar = new h(jVar3, 1);
            } catch (Throwable th2) {
                try {
                    s d13 = s.d();
                    String str2 = j.f13375p0;
                    d13.c(str2, "Unexpected error in onHandleIntent", th2);
                    s d14 = s.d();
                    d14.a(str2, "Releasing operation wake lock (" + action + ") " + a5);
                    a5.release();
                    j jVar4 = this.f13374Z;
                    aVar = jVar4.f13377Z.f21782d;
                    hVar = new h(jVar4, 1);
                } catch (Throwable th3) {
                    s d15 = s.d();
                    String str3 = j.f13375p0;
                    d15.a(str3, "Releasing operation wake lock (" + action + ") " + a5);
                    a5.release();
                    j jVar5 = this.f13374Z;
                    jVar5.f13377Z.f21782d.execute(new h(jVar5, 1));
                    throw th3;
                }
            }
            aVar.execute(hVar);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13373Y) {
            case 0:
                a();
                return;
            default:
                j jVar = this.f13374Z;
                jVar.getClass();
                s d10 = s.d();
                String str = j.f13375p0;
                d10.a(str, "Checking if commands are complete.");
                j.c();
                synchronized (jVar.f13382l0) {
                    try {
                        if (jVar.f13383m0 != null) {
                            s d11 = s.d();
                            d11.a(str, "Removing command " + jVar.f13383m0);
                            if (((Intent) jVar.f13382l0.remove(0)).equals(jVar.f13383m0)) {
                                jVar.f13383m0 = null;
                            } else {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                        }
                        n nVar = jVar.f13377Z.f21779a;
                        if (!jVar.f13381k0.b() && jVar.f13382l0.isEmpty() && !nVar.a()) {
                            s.d().a(str, "No more commands & intents.");
                            i iVar = jVar.f13384n0;
                            if (iVar != null) {
                                ((SystemAlarmService) iVar).b();
                            }
                        } else if (!jVar.f13382l0.isEmpty()) {
                            jVar.e();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }
}
