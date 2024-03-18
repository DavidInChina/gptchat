package o8;

import M3.H;
import android.content.Context;
import android.os.Bundle;
import io.sentry.C3636c1;
import java.util.ArrayList;
import u8.C5852b;
import u8.C5859i;
import u8.C5865o;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final C5865o f40971a;

    /* renamed from: b  reason: collision with root package name */
    public final String f40972b;

    /* renamed from: c  reason: collision with root package name */
    public final N7.f f40973c;

    /* renamed from: d  reason: collision with root package name */
    public final C3636c1 f40974d;

    /* renamed from: e  reason: collision with root package name */
    public final v f40975e;

    /* renamed from: f  reason: collision with root package name */
    public final C5852b f40976f;

    public p(Context context, C5865o c5865o, C3636c1 c3636c1, v vVar) {
        N7.f fVar = new N7.f();
        this.f40973c = fVar;
        this.f40972b = context.getPackageName();
        this.f40971a = c5865o;
        this.f40974d = c3636c1;
        this.f40975e = vVar;
        C5852b c5852b = new C5852b(context, c5865o, q.f40977a);
        this.f40976f = c5852b;
        c5852b.a().post(new h(this, fVar, context));
    }

    public static Bundle a(p pVar, String str, long j6, long j10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", pVar.f40972b);
        bundle.putLong("cloud.prj", j6);
        bundle.putString("nonce", str);
        bundle.putLong("warm.up.sid", j10);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C5859i(5, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(H.j(arrayList)));
        return bundle;
    }

    public static Bundle b(p pVar, long j6) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", pVar.f40972b);
        bundle.putLong("cloud.prj", j6);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C5859i(4, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(H.j(arrayList)));
        return bundle;
    }

    public static boolean c(p pVar) {
        if (pVar.f40973c.f12723a.e() && ((Integer) pVar.f40973c.f12723a.d()).intValue() == 0) {
            return true;
        }
        return false;
    }
}
