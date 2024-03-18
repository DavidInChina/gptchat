package c5;

import U3.l;
import android.gov.nist.core.Separators;
import android.view.ViewGroup;
import f5.C2937a;
import org.json.JSONObject;

/* renamed from: c5.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2295g implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f26273Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ l f26274Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C2294f f26275h0;

    public /* synthetic */ RunnableC2295g(C2294f c2294f, l lVar, int i10) {
        this.f26273Y = i10;
        this.f26275h0 = c2294f;
        this.f26274Z = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc A[Catch: Exception -> 0x0061, TryCatch #1 {Exception -> 0x0061, blocks: (B:9:0x0028, B:12:0x0050, B:16:0x0065, B:18:0x006f, B:20:0x0081, B:22:0x008b, B:24:0x0095, B:26:0x009f, B:34:0x00b4, B:35:0x00b6, B:37:0x00bc, B:38:0x00c8, B:40:0x00ce, B:41:0x00da, B:43:0x00e0, B:44:0x00e8, B:48:0x010f), top: B:53:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8 A[Catch: Exception -> 0x0061, TryCatch #1 {Exception -> 0x0061, blocks: (B:9:0x0028, B:12:0x0050, B:16:0x0065, B:18:0x006f, B:20:0x0081, B:22:0x008b, B:24:0x0095, B:26:0x009f, B:34:0x00b4, B:35:0x00b6, B:37:0x00bc, B:38:0x00c8, B:40:0x00ce, B:41:0x00da, B:43:0x00e0, B:44:0x00e8, B:48:0x010f), top: B:53:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        String str;
        String str2;
        int i12;
        int i13 = this.f26273Y;
        l lVar = this.f26274Z;
        C2294f c2294f = this.f26275h0;
        switch (i13) {
            case 0:
                try {
                    int i14 = (int) (c2294f.p().getDisplayMetrics().widthPixels / c2294f.p().getDisplayMetrics().density);
                    int i15 = i14 - 30;
                    if (((JSONObject) lVar.f17423Z).has("minWidth")) {
                        i10 = Integer.parseInt(((JSONObject) lVar.f17423Z).getString("minWidth").replace("px", ""));
                    } else {
                        i10 = 0;
                    }
                    if (((JSONObject) lVar.f17423Z).has("maxWidth")) {
                        i11 = Integer.parseInt(((JSONObject) lVar.f17423Z).getString("maxWidth").replace("px", ""));
                    } else {
                        i11 = 0;
                    }
                    if (!((JSONObject) lVar.f17423Z).has("width")) {
                        str = "";
                    } else {
                        str = ((JSONObject) lVar.f17423Z).getString("width");
                    }
                    if (!((JSONObject) lVar.f17423Z).has("height")) {
                        str2 = "";
                    } else {
                        str2 = ((JSONObject) lVar.f17423Z).getString("height");
                    }
                    if (i10 != 0 && i11 != 0) {
                        if (i15 >= i10) {
                            if (i15 > i11) {
                                i10 = i11;
                            }
                        }
                        if (!str.contains("vw")) {
                            i12 = (Integer.parseInt(str.replace("vw", "")) * i10) / 100;
                        } else if (str.contains(Separators.PERCENT)) {
                            i12 = (Integer.parseInt(str.replace(Separators.PERCENT, "")) * i10) / 100;
                        } else if (str.contains("px")) {
                            i12 = Integer.parseInt(str.replace("px", ""));
                        } else {
                            return;
                        }
                        int parseInt = Integer.parseInt(str2.replace("px", ""));
                        C2937a.d("ChallengeFragment", "Resize Width: " + i12 + ", Height: " + parseInt, new Throwable[0]);
                        if (i12 > i15) {
                            i15 = i12;
                        }
                        ViewGroup.LayoutParams layoutParams = c2294f.f26266t1.getLayoutParams();
                        layoutParams.height = (int) (parseInt * c2294f.p().getDisplayMetrics().density);
                        layoutParams.width = (int) (i15 * c2294f.p().getDisplayMetrics().density);
                        c2294f.f26266t1.setLayoutParams(layoutParams);
                        return;
                    }
                    i10 = i14 - 70;
                    if (!str.contains("vw")) {
                    }
                    int parseInt2 = Integer.parseInt(str2.replace("px", ""));
                    C2937a.d("ChallengeFragment", "Resize Width: " + i12 + ", Height: " + parseInt2, new Throwable[0]);
                    if (i12 > i15) {
                    }
                    ViewGroup.LayoutParams layoutParams2 = c2294f.f26266t1.getLayoutParams();
                    layoutParams2.height = (int) (parseInt2 * c2294f.p().getDisplayMetrics().density);
                    layoutParams2.width = (int) (i15 * c2294f.p().getDisplayMetrics().density);
                    c2294f.f26266t1.setLayoutParams(layoutParams2);
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            default:
                try {
                    Object obj = lVar.f17423Z;
                    C2294f.S(c2294f);
                    return;
                } catch (Exception e11) {
                    String message = e11.getMessage();
                    int i16 = C2294f.f26254I1;
                    c2294f.T(message);
                    return;
                }
        }
    }
}
