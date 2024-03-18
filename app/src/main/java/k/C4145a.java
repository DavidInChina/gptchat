package k;

import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import g.AbstractActivityC3122o;
import id.AbstractC3557B;
import j.C3872b;
import j.k;
import p1.AbstractC5042g;

/* renamed from: k.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4145a extends P4.a {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f36760h;

    public C4145a(int i10) {
        this.f36760h = i10;
    }

    @Override // P4.a
    public final Intent D(AbstractActivityC3122o abstractActivityC3122o, Object obj) {
        Bundle bundleExtra;
        switch (this.f36760h) {
            case 0:
                String[] strArr = (String[]) obj;
                AbstractC3557B.c0("context", abstractActivityC3122o);
                AbstractC3557B.c0("input", strArr);
                Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
                AbstractC3557B.b0("Intent(Intent.ACTION_OPE\u2026          .setType(\"*/*\")", type);
                return type;
            case 1:
                String str = (String) obj;
                AbstractC3557B.c0("context", abstractActivityC3122o);
                AbstractC3557B.c0("input", str);
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
                AbstractC3557B.b0("Intent(ACTION_REQUEST_PE\u2026EXTRA_PERMISSIONS, input)", putExtra);
                return putExtra;
            case 2:
                Uri uri = (Uri) obj;
                AbstractC3557B.c0("context", abstractActivityC3122o);
                AbstractC3557B.c0("input", uri);
                Intent putExtra2 = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri);
                AbstractC3557B.b0("Intent(MediaStore.ACTION\u2026tore.EXTRA_OUTPUT, input)", putExtra2);
                return putExtra2;
            default:
                k kVar = (k) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = kVar.f35822Z;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = kVar.f35821Y;
                        AbstractC3557B.c0("intentSender", intentSender);
                        kVar = new k(intentSender, null, kVar.f35823h0, kVar.f35824i0);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", kVar);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
        }
    }

    @Override // P4.a
    public final J0.a Y(AbstractActivityC3122o abstractActivityC3122o, Object obj) {
        switch (this.f36760h) {
            case 0:
                AbstractC3557B.c0("context", abstractActivityC3122o);
                AbstractC3557B.c0("input", (String[]) obj);
                return null;
            case 1:
                String str = (String) obj;
                AbstractC3557B.c0("context", abstractActivityC3122o);
                AbstractC3557B.c0("input", str);
                if (AbstractC5042g.a(abstractActivityC3122o, str) != 0) {
                    return null;
                }
                return new J0.a(Boolean.TRUE);
            case 2:
                AbstractC3557B.c0("context", abstractActivityC3122o);
                AbstractC3557B.c0("input", (Uri) obj);
                return null;
            default:
                super.Y(abstractActivityC3122o, obj);
                return null;
        }
    }

    public final Boolean Z0(Intent intent, int i10) {
        boolean z10 = false;
        switch (this.f36760h) {
            case 1:
                if (intent != null && i10 == -1) {
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null) {
                        int length = intArrayExtra.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 < length) {
                                if (intArrayExtra[i11] == 0) {
                                    z10 = true;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    }
                    return Boolean.valueOf(z10);
                }
                return Boolean.FALSE;
            default:
                if (i10 == -1) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
        }
    }

    @Override // P4.a
    public final Object v0(Intent intent, int i10) {
        switch (this.f36760h) {
            case 0:
                if (i10 != -1) {
                    intent = null;
                }
                if (intent == null) {
                    return null;
                }
                return intent.getData();
            case 1:
                return Z0(intent, i10);
            case 2:
                return Z0(intent, i10);
            default:
                return new C3872b(intent, i10);
        }
    }
}
