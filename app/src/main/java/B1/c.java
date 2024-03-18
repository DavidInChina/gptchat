package B1;

import android.text.SpannableStringBuilder;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final String f1712d = Character.toString('\u200e');

    /* renamed from: e  reason: collision with root package name */
    public static final String f1713e = Character.toString('\u200f');

    /* renamed from: f  reason: collision with root package name */
    public static final c f1714f;

    /* renamed from: g  reason: collision with root package name */
    public static final c f1715g;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f1716a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1717b;

    /* renamed from: c  reason: collision with root package name */
    public final m f1718c;

    static {
        n nVar = o.f1729c;
        f1714f = new c(false, 2, nVar);
        f1715g = new c(true, 2, nVar);
    }

    public c(boolean z10, int i10, m mVar) {
        this.f1716a = z10;
        this.f1717b = i10;
        this.f1718c = mVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
        if (r1 != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
        if (r2 == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
        if (r0.f1710c <= 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007f, code lost:
        switch(r0.a()) {
            case 14: goto L61;
            case 15: goto L61;
            case 16: goto L60;
            case 17: goto L60;
            case 18: goto L59;
            default: goto L65;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0083, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
        if (r1 != r3) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
        if (r1 != r3) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008f, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:?, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(CharSequence charSequence) {
        byte b10;
        b bVar = new b(charSequence);
        bVar.f1710c = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = bVar.f1710c;
            if (i13 < bVar.f1709b && i10 == 0) {
                CharSequence charSequence2 = bVar.f1708a;
                char charAt = charSequence2.charAt(i13);
                bVar.f1711d = charAt;
                if (Character.isHighSurrogate(charAt)) {
                    int codePointAt = Character.codePointAt(charSequence2, bVar.f1710c);
                    bVar.f1710c = Character.charCount(codePointAt) + bVar.f1710c;
                    b10 = Character.getDirectionality(codePointAt);
                } else {
                    bVar.f1710c++;
                    char c10 = bVar.f1711d;
                    if (c10 < '\u0700') {
                        b10 = b.f1707e[c10];
                    } else {
                        b10 = Character.getDirectionality(c10);
                    }
                }
                if (b10 != 0) {
                    if (b10 != 1 && b10 != 2) {
                        if (b10 != 9) {
                            switch (b10) {
                                case 14:
                                case 15:
                                    i12++;
                                    i11 = -1;
                                    break;
                                case 16:
                                case 17:
                                    i12++;
                                    i11 = 1;
                                    break;
                                case 18:
                                    i12--;
                                    i11 = 0;
                                    break;
                            }
                        }
                    } else if (i12 == 0) {
                    }
                } else if (i12 == 0) {
                }
                i10 = i12;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(CharSequence charSequence) {
        b bVar = new b(charSequence);
        bVar.f1710c = bVar.f1709b;
        int i10 = 0;
        while (true) {
            int i11 = i10;
            while (bVar.f1710c > 0) {
                byte a5 = bVar.a();
                if (a5 != 0) {
                    if (a5 != 1 && a5 != 2) {
                        if (a5 != 9) {
                            switch (a5) {
                                case 14:
                                case 15:
                                    if (i11 == i10) {
                                        break;
                                    }
                                    i10--;
                                    break;
                                case 16:
                                case 17:
                                    if (i11 == i10) {
                                        break;
                                    }
                                    i10--;
                                    break;
                                case 18:
                                    i10++;
                                    break;
                                default:
                                    if (i11 != 0) {
                                        break;
                                    } else {
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            continue;
                        }
                    } else if (i10 != 0) {
                        if (i11 == 0) {
                            break;
                        }
                    }
                } else if (i10 != 0) {
                    if (i11 == 0) {
                        break;
                    }
                }
            }
            return 0;
        }
        return -1;
    }

    public final SpannableStringBuilder c(CharSequence charSequence, m mVar) {
        n nVar;
        char c10;
        n nVar2;
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean b10 = mVar.b(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = this.f1717b & 2;
        String str2 = "";
        String str3 = f1713e;
        String str4 = f1712d;
        boolean z10 = this.f1716a;
        if (i10 != 0) {
            if (b10) {
                nVar2 = o.f1728b;
            } else {
                nVar2 = o.f1727a;
            }
            boolean b11 = nVar2.b(charSequence.length(), charSequence);
            if (!z10 && (b11 || a(charSequence) == 1)) {
                str = str4;
            } else if (z10 && (!b11 || a(charSequence) == -1)) {
                str = str3;
            } else {
                str = str2;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (b10 != z10) {
            if (b10) {
                c10 = '\u202b';
            } else {
                c10 = '\u202a';
            }
            spannableStringBuilder.append(c10);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append('\u202c');
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (b10) {
            nVar = o.f1728b;
        } else {
            nVar = o.f1727a;
        }
        boolean b12 = nVar.b(charSequence.length(), charSequence);
        if (!z10 && (b12 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z10 && (!b12 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
