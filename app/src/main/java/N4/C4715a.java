package n4;

import Wh.s;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import id.AbstractC3557B;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import kf.t;
import q4.n;
import u4.e;

/* renamed from: n4.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4715a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f39616a;

    public /* synthetic */ C4715a(int i10) {
        this.f39616a = i10;
    }

    @Override // n4.b
    public final Object a(Object obj, n nVar) {
        String authority;
        Context context = nVar.f43869a;
        String str = "";
        switch (this.f39616a) {
            case 0:
                return ByteBuffer.wrap((byte[]) obj);
            case 1:
                Uri uri = (Uri) obj;
                if (e.d(uri)) {
                    return null;
                }
                String scheme = uri.getScheme();
                if (scheme != null && !AbstractC3557B.K(scheme, "file")) {
                    return null;
                }
                String path = uri.getPath();
                if (path != null) {
                    str = path;
                }
                if (!Lg.n.J2(str, '/') || ((String) t.h2(uri.getPathSegments())) == null) {
                    return null;
                }
                if (AbstractC3557B.K(uri.getScheme(), "file")) {
                    String path2 = uri.getPath();
                    if (path2 == null) {
                        return null;
                    }
                    return new File(path2);
                }
                return new File(uri.toString());
            case 2:
                return ((s) obj).f21257h;
            case 3:
                int intValue = ((Number) obj).intValue();
                try {
                    if (context.getResources().getResourceEntryName(intValue) == null) {
                        return null;
                    }
                    return Uri.parse("android.resource://" + context.getPackageName() + '/' + intValue);
                } catch (Resources.NotFoundException unused) {
                    return null;
                }
            case 4:
                Uri uri2 = (Uri) obj;
                if (!AbstractC3557B.K(uri2.getScheme(), "android.resource") || (authority = uri2.getAuthority()) == null || Lg.n.n2(authority) || uri2.getPathSegments().size() != 2) {
                    return null;
                }
                String authority2 = uri2.getAuthority();
                if (authority2 != null) {
                    str = authority2;
                }
                Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(str);
                List<String> pathSegments = uri2.getPathSegments();
                int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), str);
                if (identifier != 0) {
                    return Uri.parse("android.resource://" + str + '/' + identifier);
                }
                throw new IllegalStateException(("Invalid android.resource URI: " + uri2).toString());
            default:
                return Uri.parse((String) obj);
        }
    }
}
