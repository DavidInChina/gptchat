package k;

import android.content.ClipData;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import g.AbstractActivityC3122o;
import id.AbstractC3557B;
import j.l;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kf.t;
import kf.v;

/* renamed from: k.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4149e extends P4.a {
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r0 >= 2) goto L8;
     */
    @Override // P4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Intent D(AbstractActivityC3122o abstractActivityC3122o, Object obj) {
        Intent intent;
        int extensionVersion;
        l lVar = (l) obj;
        AbstractC3557B.c0("context", abstractActivityC3122o);
        AbstractC3557B.c0("input", lVar);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33) {
            if (i10 >= 30) {
                extensionVersion = SdkExtensions.getExtensionVersion(30);
            }
            if (abstractActivityC3122o.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112) != null) {
                ResolveInfo resolveActivity = abstractActivityC3122o.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
                if (resolveActivity != null) {
                    ActivityInfo activityInfo = resolveActivity.activityInfo;
                    intent = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
                    intent.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                    intent.setType(f8.e.o(lVar.f35825a));
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            } else if (abstractActivityC3122o.getPackageManager().resolveActivity(new Intent("com.google.android.gms.provider.action.PICK_IMAGES"), 1114112) != null) {
                ResolveInfo resolveActivity2 = abstractActivityC3122o.getPackageManager().resolveActivity(new Intent("com.google.android.gms.provider.action.PICK_IMAGES"), 1114112);
                if (resolveActivity2 != null) {
                    ActivityInfo activityInfo2 = resolveActivity2.activityInfo;
                    intent = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
                    intent.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
                    intent.setType(f8.e.o(lVar.f35825a));
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            } else {
                Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent2.setType(f8.e.o(lVar.f35825a));
                if (intent2.getType() == null) {
                    intent2.setType("*/*");
                    intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                    return intent2;
                }
                return intent2;
            }
            return intent;
        }
        Intent intent3 = new Intent("android.provider.action.PICK_IMAGES");
        intent3.setType(f8.e.o(lVar.f35825a));
        return intent3;
    }

    @Override // P4.a
    public final J0.a Y(AbstractActivityC3122o abstractActivityC3122o, Object obj) {
        AbstractC3557B.c0("context", abstractActivityC3122o);
        AbstractC3557B.c0("input", (l) obj);
        return null;
    }

    @Override // P4.a
    public final Object v0(Intent intent, int i10) {
        List list;
        if (i10 != -1) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        if (data == null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Uri data2 = intent.getData();
            if (data2 != null) {
                linkedHashSet.add(data2);
            }
            ClipData clipData = intent.getClipData();
            if (clipData == null && linkedHashSet.isEmpty()) {
                list = v.f37483Y;
            } else {
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i11 = 0; i11 < itemCount; i11++) {
                        Uri uri = clipData.getItemAt(i11).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                list = new ArrayList(linkedHashSet);
            }
            return (Uri) t.h2(list);
        }
        return data;
    }
}
