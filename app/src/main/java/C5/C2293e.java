package c5;

import V1.C1482x;
import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;
import f5.C2937a;
import p1.AbstractC5036a;
import p1.AbstractC5042g;

/* renamed from: c5.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2293e implements DownloadListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C2294f f26253a;

    public C2293e(C2294f c2294f) {
        this.f26253a = c2294f;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j6) {
        C2294f c2294f = this.f26253a;
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            if (c2294f.d() != null) {
                if (c2294f.d().getPackageManager().resolveActivity(intent, 0) != null) {
                    C1482x c1482x = c2294f.f18303x0;
                    if (c1482x != null) {
                        Object obj = AbstractC5042g.f41723a;
                        AbstractC5036a.b(c1482x.f18309Z, intent, null);
                        return;
                    }
                    throw new IllegalStateException("Fragment " + c2294f + " not attached to Activity");
                }
                int i10 = C2294f.f26254I1;
                c2294f.T("You don't have an app that can do this");
            }
        } catch (Exception e10) {
            C2937a.c("ChallengeFragment", e10.getMessage(), new Throwable[0]);
            e10.printStackTrace();
        }
    }
}
