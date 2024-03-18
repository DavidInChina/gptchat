package android.gov.nist.javax.sip;

import android.gov.nist.core.Separators;
import android.gov.nist.core.a;
import android.gov.nist.javax.sip.clientauthutils.DigestServerAuthenticationHelper;
import android.gov.nist.javax.sip.message.SIPResponse;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class Utils implements UtilsExt {
    private static int callIDCounter = 0;
    private static long counter = 0;
    private static int digesterPoolsSize = 20;
    private static Random rand;
    private static String signature;
    private static MessageDigest[] digesterPool = new MessageDigest[20];
    private static Utils instance = new Utils();
    private static final char[] toHex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        for (int i10 = 0; i10 < digesterPoolsSize; i10++) {
            try {
                digesterPool[i10] = MessageDigest.getInstance(DigestServerAuthenticationHelper.DEFAULT_ALGORITHM);
            } catch (Exception e10) {
                throw new RuntimeException("Could not intialize Digester ", e10);
            }
        }
        Random random = new Random(System.nanoTime());
        rand = random;
        signature = toHexString(Integer.toString(Math.abs(random.nextInt() % 1000)).getBytes());
    }

    public static Utils getInstance() {
        return instance;
    }

    public static String getQuotedString(String str) {
        return Separators.DOUBLE_QUOTE + str.replace(Separators.DOUBLE_QUOTE, "\\\"") + '\"';
    }

    public static String getSignature() {
        return signature;
    }

    public static void main(String[] strArr) {
        final HashSet hashSet = new HashSet();
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(100);
        for (int i10 = 0; i10 < 100; i10++) {
            newFixedThreadPool.execute(new Runnable() { // from class: android.gov.nist.javax.sip.Utils.1
                @Override // java.lang.Runnable
                public void run() {
                    for (int i11 = 0; i11 < 1000000; i11++) {
                        String generateBranchId = Utils.getInstance().generateBranchId();
                        if (!hashSet.contains(generateBranchId)) {
                            hashSet.add(generateBranchId);
                        } else {
                            throw new RuntimeException("Duplicate Branch ID");
                        }
                    }
                }
            });
        }
        System.out.println("Done!!");
    }

    public static String reduceString(String str) {
        String lowerCase = str.toLowerCase();
        int length = lowerCase.length();
        String str2 = "";
        for (int i10 = 0; i10 < length; i10++) {
            if (lowerCase.charAt(i10) != ' ' && lowerCase.charAt(i10) != '\t') {
                StringBuilder p10 = a.p(str2);
                p10.append(lowerCase.charAt(i10));
                str2 = p10.toString();
            }
        }
        return str2;
    }

    public static String toHexString(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = toHex;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public static String toUpperCase(String str) {
        return str.toUpperCase(Locale.ENGLISH);
    }

    @Override // android.gov.nist.javax.sip.UtilsExt
    public String generateBranchId() {
        String str;
        long nextLong = rand.nextLong();
        long j6 = counter;
        counter = 1 + j6;
        long nanoTime = System.nanoTime() + System.currentTimeMillis() + nextLong + j6;
        MessageDigest messageDigest = digesterPool[(int) Math.abs(nanoTime % digesterPoolsSize)];
        synchronized (messageDigest) {
            byte[] digest = messageDigest.digest(Long.toString(nanoTime).getBytes());
            str = "z9hG4bK-" + signature + "-" + toHexString(digest);
        }
        return str;
    }

    @Override // android.gov.nist.javax.sip.UtilsExt
    public String generateCallIdentifier(String str) {
        String str2;
        long nextLong = rand.nextLong();
        MessageDigest messageDigest = digesterPool[(int) Math.abs(nextLong % digesterPoolsSize)];
        synchronized (messageDigest) {
            long nanoTime = System.nanoTime() + System.currentTimeMillis();
            int i10 = callIDCounter;
            callIDCounter = i10 + 1;
            str2 = toHexString(messageDigest.digest(Long.toString(nanoTime + i10 + nextLong).getBytes())) + Separators.AT + str;
        }
        return str2;
    }

    @Override // android.gov.nist.javax.sip.UtilsExt
    public synchronized String generateTag() {
        return Integer.toHexString(rand.nextInt());
    }

    public boolean responseBelongsToUs(SIPResponse sIPResponse) {
        String branch = sIPResponse.getTopmostVia().getBranch();
        if (branch != null) {
            if (branch.startsWith("z9hG4bK-" + signature)) {
                return true;
            }
        }
        return false;
    }
}
