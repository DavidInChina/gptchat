package w7;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import io.sentry.android.core.AbstractC3612c;
import t7.C5680b;
import v7.AbstractC5986d;

/* loaded from: classes2.dex */
public final class z extends H7.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractC6134f f48215a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(AbstractC6134f abstractC6134f, Looper looper) {
        super(looper, 1);
        this.f48215a = abstractC6134f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
        if (r0 == 5) goto L17;
     */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message message) {
        Object obj;
        if (this.f48215a.f48160v.get() != message.arg1) {
            int i10 = message.what;
            if (i10 != 2 && i10 != 1 && i10 != 7) {
                return;
            }
            v vVar = (v) message.obj;
            vVar.getClass();
            vVar.e();
            return;
        }
        int i11 = message.what;
        if (i11 != 1 && i11 != 7) {
            if (i11 == 4) {
                this.f48215a.getClass();
            }
        }
        if (!this.f48215a.q()) {
            v vVar2 = (v) message.obj;
            vVar2.getClass();
            vVar2.e();
            return;
        }
        int i12 = message.what;
        PendingIntent pendingIntent = null;
        if (i12 == 4) {
            AbstractC6134f abstractC6134f = this.f48215a;
            abstractC6134f.f48157s = new C5680b(message.arg2);
            if (!abstractC6134f.f48158t && !TextUtils.isEmpty(abstractC6134f.m()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(abstractC6134f.m());
                    AbstractC6134f abstractC6134f2 = this.f48215a;
                    if (!abstractC6134f2.f48158t) {
                        abstractC6134f2.v(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            AbstractC6134f abstractC6134f3 = this.f48215a;
            C5680b c5680b = abstractC6134f3.f48157s;
            if (c5680b == null) {
                c5680b = new C5680b(8);
            }
            abstractC6134f3.f48147i.n(c5680b);
            this.f48215a.getClass();
            System.currentTimeMillis();
        } else if (i12 == 5) {
            AbstractC6134f abstractC6134f4 = this.f48215a;
            C5680b c5680b2 = abstractC6134f4.f48157s;
            if (c5680b2 == null) {
                c5680b2 = new C5680b(8);
            }
            abstractC6134f4.f48147i.n(c5680b2);
            this.f48215a.getClass();
            System.currentTimeMillis();
        } else if (i12 == 3) {
            Object obj2 = message.obj;
            if (obj2 instanceof PendingIntent) {
                pendingIntent = (PendingIntent) obj2;
            }
            this.f48215a.f48147i.n(new C5680b(message.arg2, pendingIntent));
            this.f48215a.getClass();
            System.currentTimeMillis();
        } else if (i12 == 6) {
            this.f48215a.v(5, null);
            J0.a aVar = this.f48215a.f48152n;
            if (aVar != null) {
                ((AbstractC5986d) aVar.f8729Y).g(message.arg2);
            }
            this.f48215a.r();
            AbstractC6134f.u(this.f48215a, 5, 1, null);
        } else if (i12 == 2 && !this.f48215a.p()) {
            v vVar3 = (v) message.obj;
            vVar3.getClass();
            vVar3.e();
        } else {
            int i13 = message.what;
            if (i13 != 2 && i13 != 1 && i13 != 7) {
                AbstractC3612c.u("GmsClient", android.gov.nist.core.a.e("Don't know how to handle message: ", i13), new Exception());
                return;
            }
            v vVar4 = (v) message.obj;
            synchronized (vVar4) {
                try {
                    obj = vVar4.f48205a;
                    if (vVar4.f48206b) {
                        String obj3 = vVar4.toString();
                        AbstractC3612c.r("GmsClient", "Callback proxy " + obj3 + " being reused. This is not safe.");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (obj != null) {
                vVar4.a();
            }
            synchronized (vVar4) {
                vVar4.f48206b = true;
            }
            vVar4.e();
        }
    }
}
