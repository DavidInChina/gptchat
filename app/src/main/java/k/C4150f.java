package k;

import android.content.Intent;
import g.AbstractActivityC3122o;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kf.AbstractC4268D;
import kf.q;
import kf.t;
import kf.w;
import p1.AbstractC5042g;

/* renamed from: k.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4150f extends P4.a {
    @Override // P4.a
    public final Intent D(AbstractActivityC3122o abstractActivityC3122o, Object obj) {
        String[] strArr = (String[]) obj;
        AbstractC3557B.c0("context", abstractActivityC3122o);
        AbstractC3557B.c0("input", strArr);
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        AbstractC3557B.b0("Intent(ACTION_REQUEST_PE\u2026EXTRA_PERMISSIONS, input)", putExtra);
        return putExtra;
    }

    @Override // P4.a
    public final J0.a Y(AbstractActivityC3122o abstractActivityC3122o, Object obj) {
        String[] strArr = (String[]) obj;
        AbstractC3557B.c0("context", abstractActivityC3122o);
        AbstractC3557B.c0("input", strArr);
        if (strArr.length == 0) {
            return new J0.a(w.f37484Y);
        }
        for (String str : strArr) {
            if (AbstractC5042g.a(abstractActivityC3122o, str) != 0) {
                return null;
            }
        }
        int n02 = P4.a.n0(strArr.length);
        if (n02 < 16) {
            n02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(n02);
        for (String str2 : strArr) {
            linkedHashMap.put(str2, Boolean.TRUE);
        }
        return new J0.a(linkedHashMap);
    }

    @Override // P4.a
    public final Object v0(Intent intent, int i10) {
        boolean z10;
        w wVar = w.f37484Y;
        if (i10 == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i11 : intArrayExtra) {
                    if (i11 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList.add(Boolean.valueOf(z10));
                }
                return AbstractC4268D.k1(t.S2(q.h3(stringArrayExtra), arrayList));
            }
            return wVar;
        }
        return wVar;
    }
}
