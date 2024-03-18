package H2;

import B2.E;
import android.media.Spatializer;
import p2.C5065s;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements w8.g {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ p f7210Y;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        if (r2.equals("audio/ac4") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
        if (r2.f1738a != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078 A[Catch: all -> 0x008f, TryCatch #0 {all -> 0x008f, blocks: (B:4:0x0007, B:6:0x000e, B:8:0x0012, B:10:0x0017, B:28:0x0056, B:30:0x005a, B:32:0x005e, B:34:0x0062, B:36:0x0066, B:38:0x006a, B:40:0x006e, B:42:0x0078, B:44:0x0084, B:50:0x0092), top: B:54:0x0007 }] */
    @Override // w8.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean apply(Object obj) {
        boolean z10;
        E e10;
        boolean isAvailable;
        boolean isEnabled;
        p pVar = this.f7210Y;
        C5065s c5065s = (C5065s) obj;
        synchronized (pVar.f7320c) {
            try {
                z10 = true;
                if (pVar.f7323f.f7278u1 && !pVar.f7322e) {
                    char c10 = 2;
                    if (c5065s.f42297D0 > 2) {
                        String str = c5065s.f42319q0;
                        if (str != null) {
                            switch (str.hashCode()) {
                                case -2123537834:
                                    if (str.equals("audio/eac3-joc")) {
                                        c10 = 0;
                                        break;
                                    }
                                    c10 = '\uffff';
                                    break;
                                case 187078296:
                                    if (str.equals("audio/ac3")) {
                                        c10 = 1;
                                        break;
                                    }
                                    c10 = '\uffff';
                                    break;
                                case 187078297:
                                    break;
                                case 1504578661:
                                    if (str.equals("audio/eac3")) {
                                        c10 = 3;
                                        break;
                                    }
                                    c10 = '\uffff';
                                    break;
                                default:
                                    c10 = '\uffff';
                                    break;
                            }
                            switch (c10) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                    if (AbstractC5530A.f45131a >= 32) {
                                        E e11 = pVar.f7324g;
                                        if (e11 != null) {
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    if (AbstractC5530A.f45131a >= 32 && (e10 = pVar.f7324g) != null && e10.f1738a) {
                                        isAvailable = ((Spatializer) e10.f1739b).isAvailable();
                                        if (isAvailable) {
                                            isEnabled = ((Spatializer) pVar.f7324g.f1739b).isEnabled();
                                            if (isEnabled && pVar.f7324g.a(pVar.f7325h, c5065s)) {
                                                break;
                                            }
                                        }
                                    }
                                    z10 = false;
                                    break;
                            }
                        }
                        if (AbstractC5530A.f45131a >= 32) {
                            isAvailable = ((Spatializer) e10.f1739b).isAvailable();
                            if (isAvailable) {
                            }
                        }
                        z10 = false;
                    }
                }
            } finally {
            }
        }
        return z10;
    }
}
