package w2;

import android.gov.nist.core.Separators;
import android.util.SparseArray;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q.C5241w;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class u extends j {

    /* renamed from: l0  reason: collision with root package name */
    public static final Pattern f47731l0 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* renamed from: m0  reason: collision with root package name */
    public static final Pattern f47732m0 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* renamed from: n0  reason: collision with root package name */
    public static final Pattern f47733n0 = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d1, code lost:
        if (r16.renameTo(r1) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d7  */
    /* JADX WARN: Type inference failed for: r0v8, types: [w2.j, w2.u] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static u b(File file, long j6, long j10, C5241w c5241w) {
        File file2;
        long j11;
        long j12;
        String str;
        File file3;
        String name = file.getName();
        if (!name.endsWith(".v3.exo")) {
            String name2 = file.getName();
            Matcher matcher = f47732m0.matcher(name2);
            if (matcher.matches()) {
                str = matcher.group(1);
                str.getClass();
                int i10 = AbstractC5530A.f45131a;
                int length = str.length();
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < length; i13++) {
                    if (str.charAt(i13) == '%') {
                        i12++;
                    }
                }
                if (i12 != 0) {
                    int i14 = length - (i12 * 2);
                    StringBuilder sb2 = new StringBuilder(i14);
                    Matcher matcher2 = AbstractC5530A.f45137g.matcher(str);
                    while (i12 > 0 && matcher2.find()) {
                        String group = matcher2.group(1);
                        group.getClass();
                        sb2.append((CharSequence) str, i11, matcher2.start());
                        sb2.append((char) Integer.parseInt(group, 16));
                        i11 = matcher2.end();
                        i12--;
                    }
                    if (i11 < length) {
                        sb2.append((CharSequence) str, i11, length);
                    }
                    if (sb2.length() == i14) {
                        str = sb2.toString();
                    }
                    str = null;
                }
                if (str != null) {
                    File parentFile = file.getParentFile();
                    Gi.e.o(parentFile);
                    l i15 = c5241w.i(str);
                    String group2 = matcher.group(2);
                    group2.getClass();
                    long parseLong = Long.parseLong(group2);
                    String group3 = matcher.group(3);
                    group3.getClass();
                    file3 = c(parentFile, i15.f47696a, parseLong, Long.parseLong(group3));
                }
                file3 = null;
                if (file3 == null) {
                    return null;
                }
                file2 = file3;
                name = file3.getName();
            } else {
                matcher = f47731l0.matcher(name2);
                if (matcher.matches()) {
                    str = matcher.group(1);
                    str.getClass();
                    if (str != null) {
                    }
                    file3 = null;
                    if (file3 == null) {
                    }
                }
                str = null;
                if (str != null) {
                }
                file3 = null;
                if (file3 == null) {
                }
            }
        } else {
            file2 = file;
        }
        Matcher matcher3 = f47733n0.matcher(name);
        if (!matcher3.matches()) {
            return null;
        }
        String group4 = matcher3.group(1);
        group4.getClass();
        String str2 = (String) ((SparseArray) c5241w.f43574b).get(Integer.parseInt(group4));
        if (str2 == null) {
            return null;
        }
        if (j6 == -1) {
            j11 = file2.length();
        } else {
            j11 = j6;
        }
        if (j11 == 0) {
            return null;
        }
        String group5 = matcher3.group(2);
        group5.getClass();
        long parseLong2 = Long.parseLong(group5);
        if (j10 == -9223372036854775807L) {
            String group6 = matcher3.group(3);
            group6.getClass();
            j12 = Long.parseLong(group6);
        } else {
            j12 = j10;
        }
        return new j(str2, parseLong2, j11, j12, file2);
    }

    public static File c(File file, int i10, long j6, long j10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10);
        sb2.append(Separators.DOT);
        sb2.append(j6);
        sb2.append(Separators.DOT);
        return new File(file, android.gov.nist.core.a.m(sb2, j10, ".v3.exo"));
    }
}
