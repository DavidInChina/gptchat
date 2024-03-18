package g;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import o1.AbstractC4886a;
import o1.AbstractC4887b;
import o1.AbstractC4891f;
import o1.AbstractC4892g;

/* renamed from: g.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3116i extends j.h {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC3122o f30956h;

    public C3116i(AbstractActivityC3122o abstractActivityC3122o) {
        this.f30956h = abstractActivityC3122o;
    }

    @Override // j.h
    public final void b(int i10, P4.a aVar, Object obj) {
        Bundle bundle;
        String[] strArr;
        AbstractActivityC3122o abstractActivityC3122o = this.f30956h;
        J0.a Y7 = aVar.Y(abstractActivityC3122o, obj);
        if (Y7 != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC3115h(this, i10, Y7, 0));
            return;
        }
        Intent D6 = aVar.D(abstractActivityC3122o, obj);
        if (D6.getExtras() != null && D6.getExtras().getClassLoader() == null) {
            D6.setExtrasClassLoader(abstractActivityC3122o.getClassLoader());
        }
        if (D6.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = D6.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            D6.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(D6.getAction())) {
            String[] stringArrayExtra = D6.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            int i11 = AbstractC4892g.f40451b;
            HashSet hashSet = new HashSet();
            for (int i12 = 0; i12 < stringArrayExtra.length; i12++) {
                if (!TextUtils.isEmpty(stringArrayExtra[i12])) {
                    if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i12], "android.permission.POST_NOTIFICATIONS")) {
                        hashSet.add(Integer.valueOf(i12));
                    }
                } else {
                    throw new IllegalArgumentException(R.a.t(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                }
            }
            int size = hashSet.size();
            if (size > 0) {
                strArr = new String[stringArrayExtra.length - size];
            } else {
                strArr = stringArrayExtra;
            }
            if (size > 0) {
                if (size != stringArrayExtra.length) {
                    int i13 = 0;
                    for (int i14 = 0; i14 < stringArrayExtra.length; i14++) {
                        if (!hashSet.contains(Integer.valueOf(i14))) {
                            strArr[i13] = stringArrayExtra[i14];
                            i13++;
                        }
                    }
                } else {
                    return;
                }
            }
            if (abstractActivityC3122o instanceof AbstractC4891f) {
                ((AbstractC4891f) abstractActivityC3122o).getClass();
            }
            AbstractC4887b.b(abstractActivityC3122o, stringArrayExtra, i10);
        } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(D6.getAction())) {
            j.k kVar = (j.k) D6.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                IntentSender intentSender = kVar.f35821Y;
                Intent intent = kVar.f35822Z;
                int i15 = kVar.f35823h0;
                int i16 = kVar.f35824i0;
                int i17 = AbstractC4892g.f40451b;
                AbstractC4886a.c(abstractActivityC3122o, intentSender, i10, intent, i15, i16, 0, bundle);
            } catch (IntentSender.SendIntentException e10) {
                new Handler(Looper.getMainLooper()).post(new RunnableC3115h(this, i10, e10, 1));
            }
        } else {
            int i18 = AbstractC4892g.f40451b;
            AbstractC4886a.b(abstractActivityC3122o, D6, i10, bundle);
        }
    }
}
