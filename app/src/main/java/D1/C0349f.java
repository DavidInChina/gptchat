package D1;

import android.content.ClipData;
import android.gov.nist.core.Separators;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* renamed from: D1.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0349f implements AbstractC0347e, AbstractC0351g {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f3260Y = 1;

    /* renamed from: Z  reason: collision with root package name */
    public final ClipData f3261Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f3262h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f3263i0;

    /* renamed from: j0  reason: collision with root package name */
    public Uri f3264j0;

    /* renamed from: k0  reason: collision with root package name */
    public Bundle f3265k0;

    public C0349f(C0349f c0349f) {
        ClipData clipData = c0349f.f3261Z;
        clipData.getClass();
        this.f3261Z = clipData;
        int i10 = c0349f.f3262h0;
        if (i10 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        } else if (i10 <= 5) {
            this.f3262h0 = i10;
            int i11 = c0349f.f3263i0;
            if ((i11 & 1) == i11) {
                this.f3263i0 = i11;
                this.f3264j0 = c0349f.f3264j0;
                this.f3265k0 = c0349f.f3265k0;
                return;
            }
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i11) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        } else {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
    }

    @Override // D1.AbstractC0347e
    public final C0353h f() {
        return new C0353h(new C0349f(this));
    }

    @Override // D1.AbstractC0351g
    public final int g() {
        return this.f3262h0;
    }

    @Override // D1.AbstractC0351g
    public final ClipData h() {
        return this.f3261Z;
    }

    @Override // D1.AbstractC0347e
    public final void i(Bundle bundle) {
        this.f3265k0 = bundle;
    }

    @Override // D1.AbstractC0347e
    public final void j(Uri uri) {
        this.f3264j0 = uri;
    }

    @Override // D1.AbstractC0347e
    public final void k(int i10) {
        this.f3263i0 = i10;
    }

    @Override // D1.AbstractC0351g
    public final int l() {
        return this.f3263i0;
    }

    @Override // D1.AbstractC0351g
    public final ContentInfo m() {
        return null;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        switch (this.f3260Y) {
            case 1:
                StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
                sb2.append(this.f3261Z.getDescription());
                sb2.append(", source=");
                int i10 = this.f3262h0;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    if (i10 != 5) {
                                        str = String.valueOf(i10);
                                    } else {
                                        str = "SOURCE_PROCESS_TEXT";
                                    }
                                } else {
                                    str = "SOURCE_AUTOFILL";
                                }
                            } else {
                                str = "SOURCE_DRAG_AND_DROP";
                            }
                        } else {
                            str = "SOURCE_INPUT_METHOD";
                        }
                    } else {
                        str = "SOURCE_CLIPBOARD";
                    }
                } else {
                    str = "SOURCE_APP";
                }
                sb2.append(str);
                sb2.append(", flags=");
                int i11 = this.f3263i0;
                if ((i11 & 1) != 0) {
                    str2 = "FLAG_CONVERT_TO_PLAIN_TEXT";
                } else {
                    str2 = String.valueOf(i11);
                }
                sb2.append(str2);
                String str4 = "";
                if (this.f3264j0 == null) {
                    str3 = str4;
                } else {
                    str3 = ", hasLinkUri(" + this.f3264j0.toString().length() + Separators.RPAREN;
                }
                sb2.append(str3);
                if (this.f3265k0 != null) {
                    str4 = ", hasExtras";
                }
                return R.a.t(sb2, str4, "}");
            default:
                return super.toString();
        }
    }

    public C0349f(ClipData clipData, int i10) {
        this.f3261Z = clipData;
        this.f3262h0 = i10;
    }
}
