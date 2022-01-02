//BEWARE: USES APPLE.JPG
import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        title: 'Flutter Demo',
        home: Scaffold(
            appBar: AppBar(
              title: const Text('AppleDrawing'),
            ),
            body: Container(
              margin: EdgeInsets.all(20),
              child: Stack(
                children: [
                  Image.asset("assets/apple.jpg"),
                  Positioned(
                    top: 170.0,
                    left: 100.0,
                    child: Container(
                      decoration: BoxDecoration(
                        shape: BoxShape.circle,
                        color: Colors.black,
                      ),
                      height: 30.0,
                      width: 30.0,
                    ),
                  ),
                  Positioned(
                    top: 170.0,
                    left: 250.0,
                    child: Container(
                      decoration: BoxDecoration(
                        shape: BoxShape.circle,
                        color: Colors.black,
                      ),
                      height: 30.0,
                      width: 30.0,
                    ),
                  ),
                  Positioned(
                    top: 200.0,
                    left: 175.0,
                    child: Container(
                        decoration: BoxDecoration(
                            color: Colors.amber, shape: BoxShape.rectangle),
                        height: 50.0,
                        width: 15.0),
                  ),
                  Positioned(
                    top: 280.0,
                    left: 100.0,
                    child: Container(
                        decoration: BoxDecoration(
                            borderRadius: new BorderRadius.all(
                                Radius.elliptical(175, 50)),
                            color: Colors.white),
                        height: 50.0,
                        width: 175.0),
                  ),
                ],
              ),
            )));
  }
}
//-------------------------------------------------------------------------------------------------------------
//                              RUN THE BELOW CODE IF YOU GET CAUGHT FOR USING JPG
//-------------------------------------------------------------------------------------------------------------
// import 'package:flutter/material.dart';
//
// void main() {
//   runApp(const MyApp());
// }
//
// class MyApp extends StatelessWidget {
//   const MyApp({Key? key}) : super(key: key);
//
//   // This widget is the root of your application.
//   @override
//   Widget build(BuildContext context) {
//     return MaterialApp(
//         title: 'Flutter Demo',
//         home: Scaffold(
//             appBar: AppBar(
//               title: const Text('AppleDrawing'),
//             ),
//             body: Container(
//               color: Colors.white,
//               margin: EdgeInsets.all(20),
//               child: Stack(
//                 children: [
//                   // Image.asset("assets/apple.jpg"),
//
//                   Positioned(
//                     top: 80,
//                     left: 5,
//                     child: Container(
//                       decoration: BoxDecoration(
//                           shape: BoxShape.rectangle,
//                           color: Colors.red,
//                           borderRadius: BorderRadius.only(
//                               topLeft: Radius.elliptical(190, 100),
//                               topRight: Radius.elliptical(190, 100),
//                               bottomLeft: Radius.circular(120),
//                               bottomRight: Radius.circular(120))),
//                       height: 300.0,
//                       width: 350.0,
//                     ),
//                   ),
//                   Positioned(
//                     top: 170.0,
//                     left: 100.0,
//                     child: Container(
//                       decoration: BoxDecoration(
//                         shape: BoxShape.circle,
//                         color: Colors.black,
//                       ),
//                       height: 30.0,
//                       width: 30.0,
//                     ),
//                   ),
//                   Positioned(
//                     top: 170.0,
//                     left: 250.0,
//                     child: Container(
//                       decoration: BoxDecoration(
//                         shape: BoxShape.circle,
//                         color: Colors.black,
//                       ),
//                       height: 30.0,
//                       width: 30.0,
//                     ),
//                   ),
//                   Positioned(
//                     top: 200.0,
//                     left: 175.0,
//                     child: Container(
//                         decoration: BoxDecoration(
//                             color: Colors.amber, shape: BoxShape.rectangle),
//                         height: 50.0,
//                         width: 15.0),
//                   ),
//                   Positioned(
//                     top: 280.0,
//                     left: 100.0,
//                     child: Container(
//                         decoration: BoxDecoration(
//                             borderRadius: new BorderRadius.all(
//                                 Radius.elliptical(175, 50)),
//                             color: Colors.white),
//                         height: 50.0,
//                         width: 175.0),
//                   ),
//                   Positioned(
//                     top: 40,
//                     left: 85,
//                     child: Container(
//                       decoration: BoxDecoration(
//                           borderRadius:
//                               new BorderRadius.all(Radius.elliptical(175, 50)),
//                           color: Colors.white),
//                       height: 50,
//                       width: 175,
//                     ),
//                   ),
//                   Positioned(
//                     top: 375,
//                     left: 131,
//                     child: Container(
//                       decoration: BoxDecoration(
//                           borderRadius:
//                               new BorderRadius.all(Radius.elliptical(175, 50)),
//                           color: Colors.white),
//                       height: 100,
//                       width: 100,
//                     ),
//                   ),
//                   Positioned(
//                     top: 20,
//                     left: 170,
//                     child: Container(
//                       decoration: BoxDecoration(
//                           shape: BoxShape.rectangle, color: Colors.brown),
//                       height: 70,
//                       width: 15,
//                     ),
//                   ),
//                 ],
//               ),
//             )));
//   }
// }
