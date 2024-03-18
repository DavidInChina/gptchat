package X6;

import id.AbstractC3557B;
import java.util.ArrayList;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f21792a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f21793b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final StringBuilder f21794c = new StringBuilder();

    /* renamed from: d  reason: collision with root package name */
    public long f21795d;

    public final void a() {
        ArrayList arrayList = this.f21793b;
        StringBuilder sb2 = this.f21794c;
        arrayList.add(sb2.toString());
        AbstractC3557B.c0("<this>", sb2);
        sb2.setLength(0);
    }

    public final long b(char c10, Character ch2, long j6) {
        long j10 = this.f21795d;
        int f6 = AbstractC6708l.f(this.f21792a);
        StringBuilder sb2 = this.f21794c;
        switch (f6) {
            case 0:
                if (c10 != '\ufeff') {
                    if (c10 == '\"') {
                        this.f21792a = 5;
                    } else if (c10 == ',') {
                        a();
                        this.f21792a = 3;
                    } else if (c10 == '\n' || c10 == '\u2028' || c10 == '\u2029' || c10 == '\u0085') {
                        a();
                        this.f21792a = 4;
                    } else if (c10 == '\r') {
                        if (ch2 != null && ch2.charValue() == '\n') {
                            this.f21795d++;
                        }
                        a();
                        this.f21792a = 4;
                    } else {
                        sb2.append(c10);
                        this.f21792a = 2;
                    }
                }
                this.f21795d++;
                break;
            case 1:
                if (c10 == '\"') {
                    if (ch2 != null && ch2.charValue() == '\"') {
                        sb2.append(ch2.charValue());
                        this.f21792a = 2;
                        this.f21795d++;
                    } else {
                        throw new Y6.a(j6, this.f21795d, c10, "must appear escapeChar(\") after escapeChar(\")");
                    }
                } else if (c10 == ',') {
                    a();
                    this.f21792a = 3;
                } else if (c10 == '\n' || c10 == '\u2028' || c10 == '\u2029' || c10 == '\u0085') {
                    a();
                    this.f21792a = 4;
                } else if (c10 == '\r') {
                    if (ch2 != null && ch2.charValue() == '\n') {
                        this.f21795d++;
                    }
                    a();
                    this.f21792a = 4;
                } else {
                    sb2.append(c10);
                    this.f21792a = 2;
                }
                this.f21795d++;
                break;
            case 2:
                if (c10 == '\"') {
                    this.f21792a = 5;
                } else if (c10 == ',') {
                    a();
                    this.f21792a = 3;
                } else if (c10 == '\n' || c10 == '\u2028' || c10 == '\u2029' || c10 == '\u0085') {
                    a();
                    this.f21792a = 4;
                } else if (c10 == '\r') {
                    if (ch2 != null && ch2.charValue() == '\n') {
                        this.f21795d++;
                    }
                    a();
                    this.f21792a = 4;
                } else {
                    sb2.append(c10);
                    this.f21792a = 2;
                }
                this.f21795d++;
                break;
            case 3:
                throw new Y6.a(j6, this.f21795d, c10, "unexpected error");
            case 4:
            case 6:
                if (c10 == '\"') {
                    if (ch2 != null && ch2.charValue() == '\"') {
                        sb2.append('\"');
                        this.f21792a = 7;
                        this.f21795d++;
                    } else {
                        this.f21792a = 6;
                    }
                } else {
                    sb2.append(c10);
                    this.f21792a = 7;
                }
                this.f21795d++;
                break;
            case 5:
                if (c10 == ',') {
                    a();
                    this.f21792a = 3;
                } else if (c10 == '\n' || c10 == '\u2028' || c10 == '\u2029' || c10 == '\u0085') {
                    a();
                    this.f21792a = 4;
                } else if (c10 == '\r') {
                    if (ch2 != null && ch2.charValue() == '\n') {
                        this.f21795d++;
                    }
                    a();
                    this.f21792a = 4;
                } else {
                    throw new Y6.a(j6, this.f21795d, c10, "must appear delimiter or line terminator after quote end");
                }
                this.f21795d++;
                break;
        }
        return this.f21795d - j10;
    }
}
