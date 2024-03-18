package o8;

import android.os.Bundle;
import android.util.Log;
import m.AbstractActivityC4532l;
import u8.C5852b;
import u8.C5865o;
import u8.C5867q;

/* loaded from: classes.dex */
public final class r extends AbstractC4949b {

    /* renamed from: a  reason: collision with root package name */
    public final String f40978a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.appcompat.view.m f40979b;

    public r(String str, androidx.appcompat.view.m mVar) {
        this.f40978a = str;
        this.f40979b = mVar;
    }

    @Override // o8.AbstractC4949b
    public final N7.m a(AbstractActivityC4532l abstractActivityC4532l) {
        androidx.appcompat.view.m mVar = this.f40979b;
        synchronized (mVar.f24416e) {
            try {
                if (mVar.f24413b) {
                    N7.m mVar2 = new N7.m();
                    mVar2.g(0);
                    return mVar2;
                }
                mVar.f24413b = true;
                C5865o c5865o = (C5865o) mVar.f24414c;
                Object[] objArr = {1};
                c5865o.getClass();
                if (Log.isLoggable("PlayCore", 3)) {
                    Log.d("PlayCore", C5865o.c(c5865o.f46496a, "checkAndShowDialog(%s)", objArr));
                }
                Bundle bundle = new Bundle();
                bundle.putInt("dialog.intent.type", 1);
                bundle.putString("package.name", (String) mVar.f24415d);
                bundle.putInt("playcore.integrity.version.major", 1);
                bundle.putInt("playcore.integrity.version.minor", 3);
                bundle.putInt("playcore.integrity.version.patch", 0);
                bundle.putLong("request.token.sid", mVar.f24412a);
                m mVar3 = (m) mVar.f24417f;
                bundle.putLong("cloud.prj", mVar3.f40966e);
                p pVar = mVar3.f40967f;
                pVar.getClass();
                int i10 = bundle.getInt("dialog.intent.type");
                pVar.f40971a.b("requestAndShowDialog(%s)", Integer.valueOf(i10));
                N7.f fVar = new N7.f();
                k kVar = new k(pVar, fVar, bundle, abstractActivityC4532l, fVar, i10);
                C5852b c5852b = pVar.f40976f;
                c5852b.getClass();
                c5852b.a().post(new C5867q(c5852b, fVar, fVar, kVar));
                return fVar.f12723a;
            } finally {
            }
        }
    }

    @Override // o8.AbstractC4949b
    public final String b() {
        return this.f40978a;
    }
}
